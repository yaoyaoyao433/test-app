package com.meituan.msi.api.image;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PreviewImageParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    public String current;
    public boolean showmenu = true;
    @MsiParamChecker(required = true)
    public ArrayList<String> urls;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
