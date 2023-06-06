package com.meituan.msi.api.video;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ChooseMediaParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    @MsiParamChecker(in = {"video", "image", "mix"})
    public String[] mediaType;
    @MsiParamChecker(in = {"original", "compressed"})
    public String[] sizeType;
    @MsiParamChecker(in = {WmChooseMediaModule.TYPE_CAMERA, "album"})
    public String[] sourceType;
    @MsiParamChecker(max = 9, min = 1)
    public int count = 9;
    public int maxDuration = 10;
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
