/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
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

package me.xiaopan.sketch;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface ImageViewFunction {
    void onDisplay();

    boolean onTouchEvent(MotionEvent event);

    void onLayout(boolean changed, int left, int top, int right, int bottom);

    void onDraw(Canvas canvas);

    /**
     * @return 是否需要调用ImageView的invalidate()刷新显示
     */
    boolean onDisplayStarted();

    /**
     * @return 是否需要调用ImageView的invalidate()刷新显示
     */
    boolean onUpdateDownloadProgress(int totalLength, int completedLength);

    /**
     * @return 是否需要调用ImageView的invalidate()刷新显示
     */
    boolean onDisplayCompleted(ImageFrom imageFrom, String mimeType);

    /**
     * @return 是否需要调用ImageView的invalidate()刷新显示
     */
    boolean onDisplayFailed(FailedCause failedCause);

    /**
     * @return 是否需要调用ImageView的invalidate()刷新显示
     */
    boolean onCanceled(CancelCause cancelCause);
}
