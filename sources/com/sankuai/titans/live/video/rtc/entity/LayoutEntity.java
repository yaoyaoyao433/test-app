package com.sankuai.titans.live.video.rtc.entity;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LayoutEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String userId;
    public View view;
    public boolean isAdded = false;
    public int index = -1;

    public LayoutEntity(String str, View view) {
        this.userId = "";
        this.userId = str;
        this.view = view;
    }
}
