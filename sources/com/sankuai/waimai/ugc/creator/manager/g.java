package com.sankuai.waimai.ugc.creator.manager;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.c;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.b;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.utils.n;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static volatile g h;
    public com.sankuai.meituan.mtlive.ugc.library.interfaces.b b;
    public c c;
    public a d;
    public boolean e;
    public boolean f;
    private final Set<String> g;

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d1ba7500ebc0478c4dcebb85e72397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d1ba7500ebc0478c4dcebb85e72397");
        }
    }

    public static /* synthetic */ void a(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "b54dcbf9de02a0658a59d60f32dd7f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "b54dcbf9de02a0658a59d60f32dd7f59");
        } else if (gVar.c != null) {
            gVar.c.n();
        }
    }

    public static /* synthetic */ void a(g gVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "d58bcc1fc84a5ef8cb6f41cd5af8f169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "d58bcc1fc84a5ef8cb6f41cd5af8f169");
        } else if (gVar.c != null) {
            gVar.c.a(j);
        }
    }

    public static /* synthetic */ void a(g gVar, ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "6e9c8d5b475781d0f1769e42172645ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "6e9c8d5b475781d0f1769e42172645ce");
        } else if (gVar.d != null) {
            gVar.d.a(imageData);
        }
    }

    public static /* synthetic */ void a(g gVar, VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "168a92339f48955fa196d5bf79868441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "168a92339f48955fa196d5bf79868441");
        } else if (gVar.c != null) {
            gVar.c.a(videoData);
        }
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.f = false;
        return false;
    }

    public static /* synthetic */ void b(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "945c1680f7d1325345f853b1e176a2a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "945c1680f7d1325345f853b1e176a2a8");
        } else if (gVar.d != null) {
            gVar.d.g();
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc6337814ad0b6c3d2860ba82d2d56df", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc6337814ad0b6c3d2860ba82d2d56df");
        }
        if (h == null) {
            synchronized (g.class) {
                if (h == null) {
                    h = new g();
                }
            }
        }
        return h;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93a2b68e40b7a669b04bcbef996efe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93a2b68e40b7a669b04bcbef996efe5");
            return;
        }
        this.e = false;
        this.f = false;
        this.g = new HashSet();
    }

    public final void a(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee9ba7ecdbd0c93044fb3b048d20e637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee9ba7ecdbd0c93044fb3b048d20e637");
            return;
        }
        this.g.add(str);
        a(context);
    }

    public final void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0a4901c6e41b30b2870753a134fb51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0a4901c6e41b30b2870753a134fb51");
            return;
        }
        this.g.remove(str);
        b();
    }

    private void a(@NonNull final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74138dd207640a802f57bd9d65b1758b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74138dd207640a802f57bd9d65b1758b");
        } else if (this.b == null) {
            this.b = com.sankuai.meituan.mtlive.ugc.library.b.b(context, 33019);
            this.b.a(new c.b() { // from class: com.sankuai.waimai.ugc.creator.manager.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.ugc.library.c.b
                public final void a(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e4fff11455ae017215772a59a512b6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e4fff11455ae017215772a59a512b6b");
                    } else {
                        g.a(g.this, j);
                    }
                }

                @Override // com.sankuai.meituan.mtlive.ugc.library.c.b
                public final void a(c.C0617c c0617c) {
                    Object[] objArr2 = {c0617c};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e3fd3b2c6a0907a74c0c82f7c0f674", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e3fd3b2c6a0907a74c0c82f7c0f674");
                        return;
                    }
                    n.a("onRecordComplete->result:" + c0617c.a);
                    if (c0617c.a != 0 && c0617c.a != 1 && c0617c.a != 2) {
                        g.this.a(c0617c.a);
                    } else {
                        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new com.sankuai.waimai.ugc.creator.task.b(context, c0617c.c, c0617c.d) { // from class: com.sankuai.waimai.ugc.creator.manager.g.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                            public final /* synthetic */ void a(VideoData videoData) {
                                VideoData videoData2 = videoData;
                                Object[] objArr3 = {videoData2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0e7b6492a48ba32300dc1f6c65e5f17", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0e7b6492a48ba32300dc1f6c65e5f17");
                                    return;
                                }
                                g.a(g.this);
                                g.a(g.this, videoData2);
                            }
                        });
                    }
                }
            });
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a526448e4c958d451366778c631a68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a526448e4c958d451366778c631a68b");
        } else if (this.c != null) {
            this.c.a(i);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd149ed9e6e55f62349e3cb988564c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd149ed9e6e55f62349e3cb988564c6");
        } else if (this.g.size() == 0) {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f095bf73262748f130002c04be49112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f095bf73262748f130002c04be49112");
            return;
        }
        if (this.b != null) {
            this.b.d();
            this.b.a((c.b) null);
            this.b.a((b.a) null);
            this.b = null;
        }
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
    }
}
