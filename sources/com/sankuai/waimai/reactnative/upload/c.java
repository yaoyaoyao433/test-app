package com.sankuai.waimai.reactnative.upload;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.mrn.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.ugc.image.net.ImageApi;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.ugc.image.a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private String e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476e721b005ed196f7ad56733f32a82a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476e721b005ed196f7ad56733f32a82a");
            return;
        }
        this.c = jw.h;
        this.b = jw.h;
        this.e = com.sankuai.waimai.foundation.core.a.d() ? "/comment/picture/upload" : "v6/comment/picture/upload";
    }

    public c(int i, int i2, int i3, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b3f71fb5ddbcfa1aca403183a964df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b3f71fb5ddbcfa1aca403183a964df");
            return;
        }
        this.c = i <= 0 ? jw.h : i;
        this.b = i2 <= 0 ? jw.h : i2;
        this.d = i3 <= 0 ? 75 : i3;
        this.e = (str == null || str.length() <= 0) ? com.sankuai.waimai.foundation.core.a.d() ? "/comment/picture/upload" : "v6/comment/picture/upload" : str;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c8089b1589135e549b46a55900a787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c8089b1589135e549b46a55900a787");
            return;
        }
        if (i > 0) {
            this.b = i;
            this.b = i;
        }
        if (i2 > 0) {
            this.d = i2;
        }
    }

    @Override // com.sankuai.waimai.ugc.image.a
    public final String a(@NonNull Context context, String str, final com.sankuai.waimai.ugc.image.b bVar) throws Exception {
        ak akVar;
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711906652816ca4707d2b8d9b7fad27a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711906652816ca4707d2b8d9b7fad27a");
        }
        final a aVar = new a() { // from class: com.sankuai.waimai.reactnative.upload.c.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.sankuai.waimai.reactnative.upload.c.a
            public final void a(long j, long j2) {
                Object[] objArr2 = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "196e0208ed3afd62258270c1064da268", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "196e0208ed3afd62258270c1064da268");
                } else {
                    bVar.a((int) ((j * 95) / j2));
                }
            }
        };
        String a2 = com.sankuai.waimai.platform.utils.e.a(str, this.c, this.b, this.d, false);
        final File file = new File(a2);
        Object[] objArr2 = {file, "image/jpg", aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96aff6df71d412beb4721b2ac85332ca", RobustBitConfig.DEFAULT_VALUE)) {
            akVar = (ak) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96aff6df71d412beb4721b2ac85332ca");
        } else {
            final ad a3 = ad.a("image/jpg");
            akVar = new ak() { // from class: com.sankuai.waimai.reactnative.upload.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.ak
                public final String contentType() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "394de0b3b93054b3b39efa4ea0f06c82", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "394de0b3b93054b3b39efa4ea0f06c82");
                    }
                    if (ad.this == null) {
                        return null;
                    }
                    return ad.this.toString();
                }

                @Override // com.sankuai.meituan.retrofit2.ak
                public final long contentLength() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ddc772ba1fd9733dd5550e638dd88a7", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ddc772ba1fd9733dd5550e638dd88a7")).longValue() : file.length();
                }

                @Override // com.sankuai.meituan.retrofit2.ak
                public final void writeTo(OutputStream outputStream) throws IOException {
                    FileInputStream fileInputStream;
                    Object[] objArr3 = {outputStream};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8f79ae5ba1f9d89ba4c27f307306d42d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8f79ae5ba1f9d89ba4c27f307306d42d");
                        return;
                    }
                    long contentLength = contentLength();
                    long j = 0;
                    byte[] bArr = new byte[2048];
                    try {
                        try {
                            fileInputStream = new FileInputStream(file);
                            while (true) {
                                try {
                                    int read = fileInputStream.read(bArr);
                                    if (read != -1) {
                                        outputStream.write(bArr, 0, read);
                                        j += read;
                                        if (aVar != null) {
                                            aVar.a(j, contentLength);
                                        }
                                    } else {
                                        o.a(fileInputStream);
                                        return;
                                    }
                                } catch (IOException e) {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    o.a(fileInputStream);
                                    throw th;
                                }
                            }
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = null;
                    }
                }
            };
        }
        BaseResponse<com.sankuai.waimai.ugc.image.net.a> e = ((ImageApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ImageApi.class)).uploadImg(this.e, ae.b.a("file", "image.jpg", akVar)).a().e();
        if (e != null && e.data != null && e.code == 0 && !TextUtils.isEmpty(e.data.a)) {
            bVar.a(100);
            FileUtils.deleteFile(a2);
            return e.data.a;
        }
        FileUtils.deleteFile(a2);
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    abstract class a {
        public static ChangeQuickRedirect d;

        public abstract void a(long j, long j2);

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32f4f67b436578dce266a55844e887b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32f4f67b436578dce266a55844e887b");
            }
        }
    }
}
