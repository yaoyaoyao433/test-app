package com.sankuai.waimai.store.util;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.dianping.titans.service.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.service.StreamService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class r {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        Context a();

        void a(String str, Uri uri);

        void a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        boolean a;
        Uri b;
        String c;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class c extends al.b<a> {
        public static ChangeQuickRedirect a;
        private final String b;
        private final b c;
        private final String d;
        private final Call<com.sankuai.meituan.retrofit2.ap> e;

        @Override // com.sankuai.waimai.store.util.al.b
        public final /* synthetic */ void a(a aVar) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9dfcb90c00069ef752ade38b8973a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9dfcb90c00069ef752ade38b8973a1");
            } else if (aVar2.a) {
                this.c.a(this.b, aVar2.b);
            } else {
                this.c.a(this.b, aVar2.c);
            }
        }

        public c(String str, @NonNull String str2, b bVar) {
            Object[] objArr = {str, str2, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d129b33b826c222358864ca0fbb0fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d129b33b826c222358864ca0fbb0fe");
                return;
            }
            this.b = str;
            this.c = bVar;
            this.d = str2;
            this.e = ((StreamService) com.sankuai.waimai.store.util.service.a.a().b.a(StreamService.class)).getFileResponseBody(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(6:7|8|(7:(2:13|14)|21|22|(1:24)(3:28|(1:30)(2:99|(1:101)(1:102))|(3:32|(1:34)(1:62)|(5:38|39|40|41|42))(2:63|(7:67|68|69|70|71|72|(3:75|(1:77)(1:79)|78)(1:74))))|25|26|14)|18|19|20) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0249, code lost:
            if (r4 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x025a, code lost:
            if (r4 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x025c, code lost:
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x025f, code lost:
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x022d, code lost:
            if (r4 == null) goto L16;
         */
        @Override // com.sankuai.waimai.store.util.al.b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sankuai.waimai.store.util.r.a a() {
            /*
                Method dump skipped, instructions count: 623
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.util.r.c.a():com.sankuai.waimai.store.util.r$a");
        }
    }

    static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6e26828690345f6a160719c0a0be90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6e26828690345f6a160719c0a0be90e");
        } else if (inputStream == null) {
        } else {
            byte[] bArr = new byte[FileUtil.DEFAULT_STREAM_BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
