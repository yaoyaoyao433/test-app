package com.facebook.react.views.viewpager;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.bb;
import com.facebook.react.uimanager.w;
import com.facebook.react.viewmanagers.g;
import com.facebook.react.viewmanagers.h;
import com.facebook.react.views.viewpager.ReactViewPager;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactViewPagerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewPagerManager extends ViewGroupManager<ReactViewPager> implements h<ReactViewPager> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";
    private final bb<ReactViewPager> mDelegate = new g(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.h
    public void setInitialPage(ReactViewPager reactViewPager, int i) {
    }

    @Override // com.facebook.react.viewmanagers.h
    public void setKeyboardDismissMode(ReactViewPager reactViewPager, @Nullable String str) {
    }

    public void setPage(ReactViewPager reactViewPager, int i) {
    }

    public void setPageWithoutAnimation(ReactViewPager reactViewPager, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactViewPager createViewInstance(ao aoVar) {
        return new ReactViewPager(aoVar);
    }

    @Override // com.facebook.react.viewmanagers.h
    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setScrollEnabled(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.a("topPageScroll", com.facebook.react.common.c.a("registrationName", "onPageScroll"), "topPageScrollStateChanged", com.facebook.react.common.c.a("registrationName", "onPageScrollStateChanged"), "topPageSelected", com.facebook.react.common.c.a("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.c.a("setPage", 1, "setPageWithoutAnimation", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewPager reactViewPager, int i, @Nullable ReadableArray readableArray) {
        com.facebook.infer.annotation.a.a(reactViewPager);
        com.facebook.infer.annotation.a.a(readableArray);
        switch (i) {
            case 1:
                reactViewPager.a(readableArray.getInt(0), true);
                return;
            case 2:
                reactViewPager.a(readableArray.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactViewPager reactViewPager, String str, @Nullable ReadableArray readableArray) {
        char c;
        com.facebook.infer.annotation.a.a(reactViewPager);
        com.facebook.infer.annotation.a.a(readableArray);
        int hashCode = str.hashCode();
        if (hashCode != -445763635) {
            if (hashCode == 1984860689 && str.equals("setPage")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("setPageWithoutAnimation")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                reactViewPager.a(readableArray.getInt(0), true);
                return;
            case 1:
                reactViewPager.a(readableArray.getInt(0), false);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", str, getClass().getSimpleName()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ReactViewPager reactViewPager) {
        return reactViewPager.getViewCountInAdapter();
    }

    @Override // com.facebook.react.viewmanagers.h
    @ReactProp(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(ReactViewPager reactViewPager, int i) {
        reactViewPager.setPageMargin((int) w.a(i));
    }

    @Override // com.facebook.react.viewmanagers.h
    @ReactProp(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(ReactViewPager reactViewPager, boolean z) {
        reactViewPager.setClipToPadding(!z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<ReactViewPager> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactViewPager reactViewPager, View view, int i) {
        try {
            reactViewPager.getAdapter().a(view, i);
        } catch (IndexOutOfBoundsException unused) {
            reactViewPager.getAdapter().a(view, reactViewPager.getAdapter().getCount());
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ReactViewPager reactViewPager, int i) {
        return reactViewPager.getAdapter().a.get(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ReactViewPager reactViewPager, int i) {
        ReactViewPager.Adapter adapter = reactViewPager.getAdapter();
        adapter.a.remove(i);
        adapter.notifyDataSetChanged();
        ReactViewPager.this.setOffscreenPageLimit(adapter.a.size());
    }
}
