/*
 * Copyright (C) 2019 Peng fei Pan <panpfpanpf@outlook.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.sketch.request;

import androidx.annotation.NonNull;

import me.panpf.sketch.cache.DiskCache;

public class CacheDownloadResult implements DownloadResult {
    @NonNull
    private DiskCache.Entry diskCacheEntry;
    @NonNull
    private ImageFrom imageFrom;

    public CacheDownloadResult(@NonNull DiskCache.Entry diskCacheEntry, @NonNull ImageFrom imageFrom) {
        this.diskCacheEntry = diskCacheEntry;
        this.imageFrom = imageFrom;
    }

    @NonNull
    public DiskCache.Entry getDiskCacheEntry() {
        return diskCacheEntry;
    }

    @NonNull
    @Override
    public ImageFrom getImageFrom() {
        return imageFrom;
    }
}