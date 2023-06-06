package com.meituan.msi.api.video;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PreviewMediaParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int current;
    public boolean showmenu;
    @MsiParamChecker(required = true)
    public SourceItem[] sources;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class SourceItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String poster;
        public String type = "image";
        @MsiParamChecker(required = true)
        public String url;
    }
}
