/*
 * Copyright © 2016 spypunk <spypunk@gmail.com>
 *
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 */

package spypunk.snake.sound.cache;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.inject.Singleton;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import spypunk.snake.exception.SnakeException;
import spypunk.snake.sound.Sound;
import spypunk.snake.sound.SoundClip;
import spypunk.snake.sound.SoundClipImpl;
import spypunk.snake.sound.service.SoundServiceImpl;

@Singleton
public class SoundClipCacheImpl implements SoundClipCache {

    private static final Logger LOGGER = LoggerFactory.getLogger(SoundClipCacheImpl.class);

    private static final String SOUNDS_FOLDER = "/sound/".intern();

    private final Map<Sound, SoundClip> soundClips = createSoundClips();

    @Override
    public SoundClip getSoundClip(final Sound sound) {
        return soundClips.get(sound);
    }

    @Override
    public Collection<SoundClip> getAllSoundClips() {
        return soundClips.values();
    }

    private static SoundClip createSoundClip(final Sound sound) {
        try (InputStream inputStream = SoundServiceImpl.class
                .getResourceAsStream(SOUNDS_FOLDER + sound.getFileName());
                AudioInputStream audioInputStream = AudioSystem
                        .getAudioInputStream(new BufferedInputStream(inputStream))) {

            return new SoundClipImpl(audioInputStream, sound.isLoop());
        } catch (UnsupportedAudioFileException | IOException e) {
            LOGGER.error(e.getMessage(), e);
            throw new SnakeException(e);
        }
    }

    private static Map<Sound, SoundClip> createSoundClips() {
        return Lists.newArrayList(Sound.values()).stream()
                .collect(Collectors.toMap(Function.identity(), SoundClipCacheImpl::createSoundClip));
    }
}
