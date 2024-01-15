package org.example.social.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class WatchableTest {

    @Mock
    Watchable watchable;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void givenId_whenWatchPhoto_thenReturnPath() {
        when(watchable.watchPhoto("abcde")).thenReturn("path");

        String path = watchable.watchPhoto("abcde");
        assertEquals("path", path);
    }

    @Test
    void givenId_whenDownloadPhoto_thenReturnLink() {
        when(watchable.downloadPhoto("abcde")).thenReturn("http://link...");

        String link = watchable.downloadPhoto("abcde");
        assertEquals("http://link...", link);
    }
}