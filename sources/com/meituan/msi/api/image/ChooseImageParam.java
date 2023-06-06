package com.meituan.msi.api.image;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ChooseImageParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    public int count = 9;
    @MsiParamChecker(in = {"original", "compressed"})
    public List<String> sizeType;
    @MsiParamChecker(in = {"album", WmChooseMediaModule.TYPE_CAMERA})
    public String[] sourceType;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
