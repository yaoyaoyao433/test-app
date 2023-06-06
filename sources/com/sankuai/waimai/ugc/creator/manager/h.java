package com.sankuai.waimai.ugc.creator.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.c;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.utils.n;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h f;
    public com.sankuai.meituan.mtlive.ugc.library.interfaces.c b;
    public boolean c;
    public boolean d;
    public String e;
    private final Set<String> g;
    private String h;
    private long i;
    private long j;
    private d.b k;

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        hVar.d = false;
        return false;
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daccfcb41ecc20f0f1ebcaf5e59b9a70", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daccfcb41ecc20f0f1ebcaf5e59b9a70");
        }
        if (f == null) {
            synchronized (h.class) {
                if (f == null) {
                    f = new h();
                }
            }
        }
        return f;
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107d14307d8cfa258cf9485de2eb9651", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107d14307d8cfa258cf9485de2eb9651");
        } else {
            this.g = new HashSet();
        }
    }

    public final void a(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170a08ea3b14f032ee07011c872e8f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170a08ea3b14f032ee07011c872e8f21");
            return;
        }
        this.g.add(str);
        a(context);
    }

    public final void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227676f9bd19da50962d6372874b1c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227676f9bd19da50962d6372874b1c83");
            return;
        }
        this.g.remove(str);
        d();
    }

    private void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb66640ef00cb5a3c71f0350f3f45a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb66640ef00cb5a3c71f0350f3f45a75");
        } else if (this.b == null) {
            this.b = com.sankuai.meituan.mtlive.ugc.library.b.c(context, 33019);
        }
    }

    public final void a(d.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632c9f80e71982af5c869816f60fc23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632c9f80e71982af5c869816f60fc23d");
            return;
        }
        this.k = bVar;
        this.b.a(bVar);
    }

    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eee86c2edffb1debf3f684ca7422dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eee86c2edffb1debf3f684ca7422dd2");
            return;
        }
        this.i = j;
        this.j = j2;
        b();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7bcb5d48c4a0468f3dccd3cf9642c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7bcb5d48c4a0468f3dccd3cf9642c8");
        } else if (this.b == null || this.k == null || this.i < 0 || this.j <= this.i) {
        } else {
            this.b.a(this.i, this.j);
            this.c = true;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33536b66286c3e9beecdd2ee111b7e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33536b66286c3e9beecdd2ee111b7e17");
        } else if (this.b == null || !this.c) {
        } else {
            this.b.b();
            this.c = false;
        }
    }

    public final void a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85fddc1d9f5e2265e6c1242773190d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85fddc1d9f5e2265e6c1242773190d4f");
        } else if (this.b != null) {
            this.b.a(f2);
        }
    }

    public final void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbea624ff782f624c239a8c67ebfd973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbea624ff782f624c239a8c67ebfd973");
        } else if (this.b != null) {
            this.b.a(bitmap);
        }
    }

    public final void b(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d41f560fe2bbb91462dc8ce6aa056b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d41f560fe2bbb91462dc8ce6aa056b2");
        } else if (this.b != null) {
            this.b.b(j, j2);
        }
    }

    public final void a(final Context context, int i, final d dVar) {
        Object[] objArr = {context, Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2661582262b5b2b5d76cf01616701357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2661582262b5b2b5d76cf01616701357");
            return;
        }
        int i2 = i == 720 ? 3 : (i == 540 || i != 480) ? 2 : 1;
        if (this.b != null) {
            this.d = true;
            c();
            dVar.g();
            this.h = com.sankuai.waimai.ugc.creator.utils.f.a();
            this.b.a(new c.b() { // from class: com.sankuai.waimai.ugc.creator.manager.h.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.b
                public final void a(float f2) {
                }

                @Override // com.sankuai.meituan.mtlive.ugc.library.interfaces.c.b
                public final void a(d.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4853eeb72f3f5238511ce38b545e1fd4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4853eeb72f3f5238511ce38b545e1fd4");
                        return;
                    }
                    h hVar = h.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = h.a;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "240c648e3e10de0f7f680e50c2dfd8aa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "240c648e3e10de0f7f680e50c2dfd8aa");
                    } else if (hVar.b != null && !hVar.c) {
                        hVar.b.c();
                        hVar.c = true;
                    }
                    if (aVar.a == 0) {
                        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new com.sankuai.waimai.ugc.creator.task.b(context, h.this.h, null) { // from class: com.sankuai.waimai.ugc.creator.manager.h.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                            public final /* synthetic */ void a(VideoData videoData) {
                                VideoData videoData2 = videoData;
                                Object[] objArr4 = {videoData2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4d18c3584120ec306668c885f4effec2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4d18c3584120ec306668c885f4effec2");
                                    return;
                                }
                                h.a(h.this, false);
                                dVar.i();
                                if (videoData2 == null || TextUtils.isEmpty(videoData2.h) || TextUtils.isEmpty(videoData2.t.h) || !FileUtils.isFileExist(videoData2.h) || !FileUtils.isFileExist(videoData2.t.h)) {
                                    n.a("onGenerateComplete->onResult, mediaData is invalid:");
                                    dVar.j();
                                    return;
                                }
                                dVar.a(videoData2);
                            }
                        });
                        return;
                    }
                    n.a("onGenerateComplete->error, retCode:" + aVar.a + ", descMsg:" + aVar.b);
                    h.a(h.this, false);
                    dVar.i();
                    dVar.j();
                }
            });
            this.b.a(i2, this.h);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a2b6d67ecbf815385045dd2e1bb018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a2b6d67ecbf815385045dd2e1bb018");
        } else if (this.g.size() == 0) {
            e();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d566c5cd385b338a4410ee396ea3d6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d566c5cd385b338a4410ee396ea3d6c");
        } else if (this.b != null) {
            this.e = null;
            this.b.a();
            this.b = null;
        }
    }
}
