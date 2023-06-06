package com.sankuai.waimai.store.viewblocks;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.b implements IPlayerStateCallback {
    public static ChangeQuickRedirect c;
    private final com.meituan.android.mtplayer.video.h a;
    private MTVideoPlayerView b;
    public final com.sankuai.waimai.store.viewblocks.b d;
    public b e;
    public InterfaceC1339a f;
    private FrameLayout g;
    private int h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.viewblocks.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1339a {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void b();
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i, int i2, int i3) {
    }

    public a(@NonNull Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad62c51e8ea7f52c9f721cf54409886", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad62c51e8ea7f52c9f721cf54409886");
            return;
        }
        this.a = new com.meituan.android.mtplayer.video.h();
        this.h = 0;
        this.d = a(context, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b3863c4331324f1546526f21feb495", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b3863c4331324f1546526f21feb495");
        }
        this.g = new FrameLayout(viewGroup.getContext());
        this.g.setLayoutParams(a());
        this.b = new MTVideoPlayerView(viewGroup.getContext());
        this.b.setMultiPlayerManager(this.a);
        this.b.setBackgroundResource(R.color.wm_st_common_222426);
        this.b.setLayoutParams(a());
        this.g.addView(this.b);
        this.b.addView(this.d.createView(this.b));
        this.d.d();
        return this.g;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41a09fc54ee09cc1cd2b9e26dd7b63b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41a09fc54ee09cc1cd2b9e26dd7b63b");
            return;
        }
        this.b.setDisplayView(MTVideoPlayerView.a.TYPE_TEXTURE);
        this.b.setDisplayMode(0);
        this.b.setCoverView(this.d);
        this.b.setPlayStateCallback(this);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b57337a887f3b645af704ad5f4d0dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b57337a887f3b645af704ad5f4d0dbc");
        } else if (this.h == 0) {
        } else {
            this.d.a(true);
            this.d.d();
            this.h = 0;
            a(this.b);
            this.g.addView(this.b, 0, a());
            if (this.f != null) {
                this.f.a(this.h);
            }
        }
    }

    public final void h() {
        ViewGroup a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d47498690f1c73607ca412877b8993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d47498690f1c73607ca412877b8993");
        } else if (this.h == 1) {
        } else {
            this.d.a(true);
            Context context = getContext();
            if (!(context instanceof Activity) || com.sankuai.waimai.store.util.b.a(context) || (a = a((Activity) context)) == null) {
                return;
            }
            com.sankuai.waimai.store.viewblocks.b bVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a9a8fa1cb31c4401c466189549dce0db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a9a8fa1cb31c4401c466189549dce0db");
            } else {
                bVar.d.l();
                bVar.e.m();
            }
            this.h = 1;
            a(this.b);
            a.addView(this.b, a());
            if (this.f != null) {
                this.f.a(this.h);
            }
        }
    }

    private ViewGroup a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe248b52fc76fefce944929f122a94d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe248b52fc76fefce944929f122a94d");
        }
        try {
            return (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
        } catch (Exception unused) {
            return null;
        }
    }

    private ViewGroup.LayoutParams a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d12786ea23c191245fa37e65a38f0a", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d12786ea23c191245fa37e65a38f0a") : new ViewGroup.LayoutParams(-1, -1);
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47e015e64ed5c2f020d56dbb01251453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47e015e64ed5c2f020d56dbb01251453");
        } else if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final boolean i() {
        return this.h == 1;
    }

    public final void a(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88d272f91898f717db517c6d63f2ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88d272f91898f717db517c6d63f2ccf");
            return;
        }
        com.sankuai.waimai.store.viewblocks.b bVar = this.d;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.viewblocks.b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c677f93f179eac30e848ae495e9882f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c677f93f179eac30e848ae495e9882f6");
        } else {
            bVar.h = eVar;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a243049f8f2b5a0bccf7ec10d8ef5451", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a243049f8f2b5a0bccf7ec10d8ef5451");
            } else {
                com.sankuai.shangou.stone.util.log.a.d("MTPlayer", "showInitView", new Object[0]);
                bVar.d.a(bVar.h);
                bVar.e.a(bVar.h);
                bVar.a(bVar.h);
            }
        }
        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(eVar.c);
        videoPlayerParam.a("poi-video", new d.a(getContext()).a(1).a());
        this.b.setDataSource(videoPlayerParam);
    }

    public com.sankuai.waimai.store.viewblocks.b a(Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa1c2f7cdbb393595fabd30d9cc4ad0", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.viewblocks.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa1c2f7cdbb393595fabd30d9cc4ad0") : new com.sankuai.waimai.store.viewblocks.b(context, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c4f671f11a91bda4ddaac5268a4a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c4f671f11a91bda4ddaac5268a4a82");
        } else {
            this.d.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7b38b4fec8797dc25675537332d4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7b38b4fec8797dc25675537332d4c8");
        } else if (this.d.f()) {
            this.d.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d157350b228ad447eb92c79b9ae2bdc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d157350b228ad447eb92c79b9ae2bdc3");
            return;
        }
        this.a.a();
        this.d.onDestroy();
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ce5c4d90a1ec30cd5c16fc71f07ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ce5c4d90a1ec30cd5c16fc71f07ade");
        } else if (i != 2 || this.e == null) {
        } else {
            this.e.b();
        }
    }
}
