package com.meituan.msi.api.video;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ChooseVideoParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    public String[] sourceType;
    public boolean compressed = true;
    public int maxDuration = 60;
    @MsiParamChecker(in = {"back", "front"})
    public String camera = "back";

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
