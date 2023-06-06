package com.meituan.android.screenshot.model;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.Keep;
import com.meituan.android.screenshot.listener.a;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ScreenShotItemModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Drawable imageDrawable;
    public String itemText;
    public String jumpUrl;
    public a listener;
    @DrawableRes
    public int resId;
    public String showActivityName;

    public ScreenShotItemModel() {
    }

    public ScreenShotItemModel(Drawable drawable, String str, String str2) {
        this.imageDrawable = drawable;
        this.itemText = str;
        this.jumpUrl = str2;
    }

    public ScreenShotItemModel(@DrawableRes int i, String str, String str2) {
        this.resId = i;
        this.itemText = str;
        this.jumpUrl = str2;
    }

    public ScreenShotItemModel(Drawable drawable, String str, a aVar) {
        this.imageDrawable = drawable;
        this.itemText = str;
        this.listener = aVar;
    }

    public ScreenShotItemModel(@DrawableRes int i, String str, a aVar) {
        this.resId = i;
        this.itemText = str;
        this.listener = aVar;
    }

    public ScreenShotItemModel(Drawable drawable, String str, String str2, String str3) {
        this.imageDrawable = drawable;
        this.itemText = str;
        this.showActivityName = str2;
        this.jumpUrl = str3;
    }

    public ScreenShotItemModel(@DrawableRes int i, String str, String str2, String str3) {
        this.resId = i;
        this.itemText = str;
        this.showActivityName = str2;
        this.jumpUrl = str3;
    }

    public ScreenShotItemModel(Drawable drawable, String str, String str2, a aVar) {
        this.imageDrawable = drawable;
        this.itemText = str;
        this.showActivityName = str2;
        this.listener = aVar;
    }

    public ScreenShotItemModel(@DrawableRes int i, String str, String str2, a aVar) {
        this.resId = i;
        this.itemText = str;
        this.showActivityName = str2;
        this.listener = aVar;
    }
}
