/*
 * Copyright © 2016 spypunk <spypunk@gmail.com>
 *
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the COPYING file for more details.
 */

package spypunk.snake.service;

import spypunk.snake.model.Direction;
import spypunk.snake.model.Snake;
import spypunk.snake.model.SnakeInstance;

public interface SnakeInstanceService {

    void create(Snake snake);

    void update(SnakeInstance snakeInstance);

    void updateDirection(SnakeInstance snakeInstance, Direction direction);

    void pause(SnakeInstance snakeInstance);
}
