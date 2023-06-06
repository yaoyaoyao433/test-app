package com.meituan.msi.api.video;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SaveVideoToPhotosAlbumParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    @MsiParamChecker(required = true)
    public String filePath;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
