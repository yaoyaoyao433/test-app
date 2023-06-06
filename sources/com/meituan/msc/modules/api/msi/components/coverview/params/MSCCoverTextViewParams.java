package com.meituan.msc.modules.api.msi.components.coverview.params;

import com.google.gson.JsonElement;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class MSCCoverTextViewParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean clickable;
    public JsonElement data;
    public Boolean gesture;
    public Label label;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Label {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String color;
        public String content;
        public Double fontSize;
        public String fontWeight;
        public String lineBreak;
        public Double lineHeight;
        public String textAlign;
    }
}
