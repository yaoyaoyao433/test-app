package com.sankuai.waimai.store.drug.viewblocks;

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
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.b implements IPlayerStateCallback {
    public static ChangeQuickRedirect c;
    private final h a;
    private MTVideoPlayerView b;
    public final com.sankuai.waimai.store.drug.viewblocks.b d;
    public b e;
    public InterfaceC1171a f;
    private FrameLayout g;
    private int h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.viewblocks.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1171a {
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

    public a(@NonNull Context context, com.sankuai.waimai.store.drug.video.video.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962cf43b7510576dcf91d1f773a04633", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962cf43b7510576dcf91d1f773a04633");
            return;
        }
        this.a = new h();
        this.h = 0;
        this.d = a(context, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50955b96dec1f46b82b4efe404db2ea2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50955b96dec1f46b82b4efe404db2ea2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127bb2b68a5124e78a40ce7137fc16d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127bb2b68a5124e78a40ce7137fc16d9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3c05e20010cd5d7f6011d81110e2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3c05e20010cd5d7f6011d81110e2f6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88c3a4f1ad49a737c98d1d371047500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88c3a4f1ad49a737c98d1d371047500");
        } else if (this.h == 1) {
        } else {
            this.d.a(true);
            Context context = getContext();
            if (!(context instanceof Activity) || com.sankuai.waimai.store.util.b.a(context) || (a = a((Activity) context)) == null) {
                return;
            }
            com.sankuai.waimai.store.drug.viewblocks.b bVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3440a1bb74f2670c51de9338675524b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3440a1bb74f2670c51de9338675524b3");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9b6bb3a3b56e84db633b05e2a6d558", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9b6bb3a3b56e84db633b05e2a6d558");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20bcfb4f3e0b144cd2b453f9da746b8e", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20bcfb4f3e0b144cd2b453f9da746b8e") : new ViewGroup.LayoutParams(-1, -1);
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92cbb76a110195a53cf9b212d9e03fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92cbb76a110195a53cf9b212d9e03fbe");
        } else if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final boolean i() {
        return this.h == 1;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8673c39ffe02aa58ddd1bd5a0d1343dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8673c39ffe02aa58ddd1bd5a0d1343dc");
            return;
        }
        com.sankuai.waimai.store.drug.viewblocks.b bVar = this.d;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.viewblocks.b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8b3d4dd073dbd887fb9537f4eb3fce77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8b3d4dd073dbd887fb9537f4eb3fce77");
        } else {
            bVar.h = eVar;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.drug.viewblocks.b.c;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "c8f517b60193d658038520a44169736a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "c8f517b60193d658038520a44169736a");
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

    public com.sankuai.waimai.store.drug.viewblocks.b a(Context context, com.sankuai.waimai.store.drug.video.video.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b545f3d7ab2da36b7732eb7671cf1b4", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.viewblocks.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b545f3d7ab2da36b7732eb7671cf1b4") : new com.sankuai.waimai.store.drug.viewblocks.b(context, aVar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40cdaf766c6275cb9c3904b2b648117b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40cdaf766c6275cb9c3904b2b648117b");
        } else {
            this.d.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6448a9152cb04526cee3dea7ffdb9b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6448a9152cb04526cee3dea7ffdb9b75");
        } else if (this.d.f()) {
            this.d.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53cdf55f9e53a702dd10b3228f412c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53cdf55f9e53a702dd10b3228f412c5");
            return;
        }
        this.a.a();
        this.d.onDestroy();
    }

    @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8726917e6b90eb75767fd542f36701ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8726917e6b90eb75767fd542f36701ca");
        } else if (i != 2 || this.e == null) {
        } else {
            this.e.b();
        }
    }
}
