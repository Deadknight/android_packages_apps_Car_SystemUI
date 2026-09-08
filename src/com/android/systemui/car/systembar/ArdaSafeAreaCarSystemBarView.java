package com.android.systemui.car.systembar;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Compatibility base for ARDA system-bar views.
 * Safe-area geometry is owned by SystemBarConfigsImpl outer window params.
 */
// ARDA_SAFEAREA_INNER_DISABLED_V2
public class ArdaSafeAreaCarSystemBarView extends CarSystemBarView {
    public ArdaSafeAreaCarSystemBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
