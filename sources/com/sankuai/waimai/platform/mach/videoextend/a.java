package com.sankuai.waimai.platform.mach.videoextend;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.mach.component.base.a<VideoView> implements c {
    public static ChangeQuickRedirect b;
    private String a;
    protected final d c;
    public b d;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(VideoView videoView) {
        VideoView videoView2 = videoView;
        Object[] objArr = {videoView2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55765335a34c93c5f9dedbeb475119ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55765335a34c93c5f9dedbeb475119ec");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b(this.a, "onViewCreated()", new Object[0]);
        super.a((a) videoView2);
        if (this.c != null) {
            d dVar = this.c;
            Object[] objArr2 = {videoView2};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "40b3d62c0c0a74368a21febccd560d30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "40b3d62c0c0a74368a21febccd560d30");
            } else if (videoView2 != null) {
                dVar.d = videoView2;
                dVar.b = true;
            }
            d dVar2 = this.c;
            b bVar = this.d;
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "b83829abeb32cd1776e7691f4ad4eb42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "b83829abeb32cd1776e7691f4ad4eb42");
                return;
            }
            dVar2.c = bVar;
            if (dVar2.d != null) {
                dVar2.d.setData(bVar);
                dVar2.b = true;
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ VideoView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0a2a7c6d7fe566ce860e2fb596b9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0a2a7c6d7fe566ce860e2fb596b9b8");
        }
        com.sankuai.waimai.foundation.utils.log.a.b(this.a, "getHostView()创建新实例", new Object[0]);
        if (this.c != null) {
            this.c.c();
        }
        VideoView videoView = new VideoView(context);
        videoView.setJsCallBack(this);
        return videoView;
    }

    public final d e() {
        return this.c;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63983c493ea8d0147b4f7058c9bc7fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63983c493ea8d0147b4f7058c9bc7fa");
            return;
        }
        this.a = a.class.getSimpleName();
        this.c = new d();
    }

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0111d955fdd898ea7cf878eb303abe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0111d955fdd898ea7cf878eb303abe");
            return;
        }
        this.a = a.class.getSimpleName();
        this.c = dVar;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        int i;
        Object obj;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "395e8bddedf34841886ce058e2bc4b2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "395e8bddedf34841886ce058e2bc4b2b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b(this.a, "onBind()", new Object[0]);
        this.d = new b();
        String a = a("biz-id");
        if (i(a)) {
            b bVar = this.d;
            Object[] objArr2 = {a};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1092a70deb763683a5cce8e7d2ced736", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1092a70deb763683a5cce8e7d2ced736");
            } else if (!TextUtils.isEmpty(a)) {
                bVar.b = a;
            }
        }
        String a2 = a("bid");
        if (i(a2)) {
            this.d.c = a2;
        }
        String a3 = a("video-url");
        if (i(a3)) {
            b bVar2 = this.d;
            Object[] objArr3 = {a3};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "caf8fa1e4f90c46f6d2dcb8b0788ef16", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "caf8fa1e4f90c46f6d2dcb8b0788ef16");
            } else if (!TextUtils.isEmpty(a3)) {
                bVar2.d = a3.trim();
            }
        }
        String a4 = a("image-url");
        if (i(a4)) {
            this.d.e = a4;
        }
        String a5 = a("poi-id");
        if (i(a5)) {
            b bVar3 = this.d;
            Object[] objArr4 = {a5};
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect4, false, "9bcb3173c722f3ffddde676abf3841d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect4, false, "9bcb3173c722f3ffddde676abf3841d4");
            } else {
                try {
                    bVar3.f = String.valueOf(Double.valueOf(a5).longValue());
                } catch (Exception unused) {
                    bVar3.f = a5;
                }
            }
        }
        String a6 = a("video-id");
        if (i(a6)) {
            this.d.g = a6;
        }
        String a7 = a("video-time");
        if (i(a7)) {
            this.d.h = a7;
        }
        List list = null;
        Map<String, Object> k = k();
        if (k != null) {
            if (k.containsKey("point-in-time")) {
                try {
                    list = (List) k.get("point-in-time");
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.e(this.a, e.toString(), new Object[0]);
                }
                LinkedList linkedList = new LinkedList();
                if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                    for (Object obj2 : list) {
                        if (obj2 instanceof Number) {
                            linkedList.add(Integer.valueOf(((Number) obj2).intValue()));
                        }
                    }
                }
                this.d.j = linkedList;
            }
            if (k.containsKey("delay-time")) {
                try {
                    obj = k.get("delay-time");
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.e(this.a, e2.toString(), new Object[0]);
                }
                if (obj instanceof Number) {
                    i = ((Number) obj).intValue();
                    this.d.i = i;
                }
                i = 0;
                this.d.i = i;
            }
            if (k.containsKey("countdown-enabled")) {
                try {
                    z = ((Boolean) k.get("countdown-enabled")).booleanValue();
                } catch (Exception e3) {
                    com.sankuai.waimai.foundation.utils.log.a.e(this.a, e3.toString(), new Object[0]);
                }
                this.d.k = z;
            }
        }
    }

    @Override // com.sankuai.waimai.platform.mach.videoextend.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49be3db2d2875ee3c14d1a7906611ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49be3db2d2875ee3c14d1a7906611ff3");
            return;
        }
        String str2 = this.a;
        com.sankuai.waimai.foundation.utils.log.a.b(str2, "sendJsEvent=====eventKey:" + str + "\t\tparams:" + map, new Object[0]);
        if (this.m != null) {
            this.m.sendJsEvent(str, map);
        } else {
            com.sankuai.waimai.foundation.utils.log.a.e(this.a, "getMach()==null", new Object[0]);
        }
    }
}
