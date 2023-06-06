package com.meituan.msi.api.video;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ChooseMediaResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<TempFile> tempFiles;
    public String type;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class TempFile {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int duration;
        public String fileType;
        public int height;
        public long size;
        public String tempFilePath;
        public String thumbTempFilePath;
        public int width;
    }
}
