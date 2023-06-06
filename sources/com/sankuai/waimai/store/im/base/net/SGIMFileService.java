package com.sankuai.waimai.store.im.base.net;

import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.upload.ImageInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGIMFileService {
    @POST("v1/mss/upload")
    @Multipart
    rx.d<BaseResponse<ImageInfo>> uploadFile(@Part ae.b bVar);
}
