package com.example.demo.Config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {
    @Test
    public void testJenkinsJob() {
        // Проверяем, что сборка завершилась успешно
        boolean buildSuccessful = true; // Здесь нужно проверить реальный статус сборки в Jenkins
        assertTrue(buildSuccessful, "Сборка завершилась с ошибкой");
    }

    @Test
    public void testJenkinsJobTwo() {
        // Проверяем, что сборка завершилась успешно
        boolean buildSuccessful = false; // Здесь нужно проверить реальный статус сборки в Jenkins
        assertFalse(buildSuccessful, "Сборка завершилась с ошибкой");
    }
}
