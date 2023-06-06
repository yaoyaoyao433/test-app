package com.tencent.map.lib.models;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class MapExploreByTouchHelper extends ExploreByTouchHelper {
    protected static final int MAP_ACTION_CLICKED = 1;
    protected static final int NO_ITEM = -1;
    public List<AccessibleTouchItem> accessibleTouchItems;

    protected abstract int getTargetPoiItemIdx(float f, float f2);

    protected abstract boolean onItemClicked(int i);

    public MapExploreByTouchHelper(@NonNull View view) {
        super(view);
        this.accessibleTouchItems = new ArrayList();
    }

    @Override // android.support.v4.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        int targetPoiItemIdx = getTargetPoiItemIdx(f, f2);
        if (targetPoiItemIdx == -1) {
            return Integer.MIN_VALUE;
        }
        return targetPoiItemIdx;
    }

    @Override // android.support.v4.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        for (int i = 0; i < this.accessibleTouchItems.size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // android.support.v4.widget.ExploreByTouchHelper
    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        if (i >= this.accessibleTouchItems.size()) {
            accessibilityEvent.getText().add("");
            return;
        }
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i);
        if (accessibleTouchItem == null) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityEvent.getText().add(accessibleTouchItem.getContentDescription());
    }

    @Override // android.support.v4.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (i >= this.accessibleTouchItems.size()) {
            accessibilityNodeInfoCompat.setText("");
            accessibilityNodeInfoCompat.setBoundsInParent(new Rect());
            return;
        }
        AccessibleTouchItem accessibleTouchItem = this.accessibleTouchItems.get(i);
        if (accessibleTouchItem == null) {
            throw new IllegalArgumentException("Invalid virtual view id");
        }
        accessibilityNodeInfoCompat.setText(accessibleTouchItem.getContentDescription());
        accessibilityNodeInfoCompat.setBoundsInParent(accessibleTouchItem.getBounds());
        accessibilityNodeInfoCompat.addAction(16);
    }

    @Override // android.support.v4.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            return onItemClicked(i);
        }
        return false;
    }

    public void onTalkBackActivate(View view) {
        ViewCompat.setAccessibilityDelegate(view, this);
    }

    public void onTalkBackDeActivate(View view) {
        ViewCompat.setAccessibilityDelegate(view, null);
    }
}
