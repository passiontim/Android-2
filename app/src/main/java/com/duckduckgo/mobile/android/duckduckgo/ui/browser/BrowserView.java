package com.duckduckgo.mobile.android.duckduckgo.ui.browser;

import android.support.annotation.NonNull;

import com.duckduckgo.mobile.android.duckduckgo.ui.bookmarks.BookmarkEntity;

/**
 * Created by fgei on 5/22/17.
 */

public interface BrowserView {
    void createNewTab(@NonNull String id);

    void showTab(@NonNull String id);

    void deleteTab(@NonNull String id);

    void deleteAll();
}
