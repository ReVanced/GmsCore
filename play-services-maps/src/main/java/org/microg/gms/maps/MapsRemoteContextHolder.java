/*
 * SPDX-FileCopyrightText: 2026 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.maps;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MapsRemoteContextHolder {
    private static volatile Context remoteContext;

    private MapsRemoteContextHolder() {
    }

    public static void set(@Nullable Context context) {
        remoteContext = context;
    }

    @Nullable
    public static Context get() {
        return remoteContext;
    }

    @NonNull
    public static Context require() {
        Context context = remoteContext;
        if (context == null) {
            throw new IllegalStateException("Maps remote context has not been initialized");
        }
        return context;
    }
}
