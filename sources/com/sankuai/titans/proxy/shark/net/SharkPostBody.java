package com.sankuai.titans.proxy.shark.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.titans.protocol.services.IStatisticsService;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SharkPostBody implements ak {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final byte[] mContent;
    private final String mContentType;
    private IStatisticsService statisticsService;

    public SharkPostBody(String str, String str2, IStatisticsService iStatisticsService) {
        Object[] objArr = {str, str2, iStatisticsService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bab477a427a2da3e003521dc42b336be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bab477a427a2da3e003521dc42b336be");
            return;
        }
        this.mContentType = str;
        if (TextUtils.isEmpty(str2)) {
            this.mContent = new byte[0];
        } else {
            this.mContent = str2.getBytes();
        }
        this.statisticsService = iStatisticsService;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public String contentType() {
        return this.mContentType;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public long contentLength() {
        return this.mContent.length;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public void writeTo(OutputStream outputStream) {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cfb8e436044c8fb8fc3f6c8e6a217e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cfb8e436044c8fb8fc3f6c8e6a217e8");
            return;
        }
        try {
            outputStream.write(this.mContent);
        } catch (IOException e) {
            this.statisticsService.reportClassError("SharkPostBody", "writeTo", e);
        }
    }
}
