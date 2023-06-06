package com.sankuai.waimai.store.viewblocks;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.ao;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public static ChangeQuickRedirect b;
    private SeekBar a;
    protected ImageView c;
    public ImageView d;
    private ProgressBar e;
    private ImageView f;
    private ViewGroup g;
    private View h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private final a m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(SeekBar seekBar);

        void h();

        void i();

        void j();
    }

    public abstract int a();

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8869b8c47fe6cab47b09544576d313c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8869b8c47fe6cab47b09544576d313c1");
        } else {
            this.m = aVar;
        }
    }

    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aefbb68532122318b031c980ad67144", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aefbb68532122318b031c980ad67144");
        }
        this.h = layoutInflater.inflate(a(), viewGroup, false);
        n();
        return this.h;
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b63bad9a75d2f47311670c7cdb4570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b63bad9a75d2f47311670c7cdb4570");
            return;
        }
        this.e = (ProgressBar) a(R.id.pb_circle_loading);
        this.l = (TextView) a(R.id.txt_video_tip);
        if (this.l != null) {
            this.l.setBackground(com.sankuai.waimai.store.util.e.b(this.h.getContext(), (int) R.color.wm_sc_good_list_black9, (int) R.dimen.wm_sc_common_dimen_14));
        }
        this.a = (SeekBar) a(R.id.player_small_screen_seekBar);
        this.c = (ImageView) a(R.id.player_play_icon);
        this.i = (TextView) a(R.id.player_continue);
        this.j = (TextView) a(R.id.txt_player_position);
        this.k = (TextView) a(R.id.txt_player_duration);
        this.f = (ImageView) a(R.id.player_mute_toggle);
        this.g = (ViewGroup) a(R.id.rl_play_progress_bar);
        this.d = (ImageView) a(R.id.iv_video_cover);
        o();
    }

    private <T extends View> T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd25df7c9b3a7560a98f0f0fdd42d94e", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd25df7c9b3a7560a98f0f0fdd42d94e") : (T) this.h.findViewById(i);
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71300f9bfa24f09fa4bc70cb80549a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71300f9bfa24f09fa4bc70cb80549a75");
            return;
        }
        if (this.f != null) {
            this.f.setOnClickListener(this);
        }
        if (this.c != null) {
            this.c.setOnClickListener(this);
        }
        if (this.a != null) {
            this.a.setOnSeekBarChangeListener(this);
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e3559dd75cc55a111e90f9c59c3362b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e3559dd75cc55a111e90f9c59c3362b");
                } else {
                    c.this.m.j();
                }
            }
        });
    }

    public final void a(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "385aa91795b2b2256fbb4e0369030ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "385aa91795b2b2256fbb4e0369030ae1");
        } else {
            b(eVar);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7983e177ceb8d6b3db19844b74d49ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7983e177ceb8d6b3db19844b74d49ad");
        } else {
            u.a(this.e);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c337ad7815e49eb7237807fadf72cc5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c337ad7815e49eb7237807fadf72cc5e");
        } else {
            u.c(this.e);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62965af28b128d44a353c6199a4da616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62965af28b128d44a353c6199a4da616");
        } else {
            u.a(this.d);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799b4f5bfdb6143cfcb6c8996810806b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799b4f5bfdb6143cfcb6c8996810806b");
        } else {
            u.c(this.d);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c2402c21920976fac1b2639c102b4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c2402c21920976fac1b2639c102b4d");
            return;
        }
        u.c(this.f, this.g);
        u.a(this.e);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a03998d3f457f81297bd79ba04f12b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a03998d3f457f81297bd79ba04f12b1");
        } else {
            u.c(this.e);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4537b5707d60f89a7f60cf02ea432c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4537b5707d60f89a7f60cf02ea432c");
            return;
        }
        u.c(this.e);
        u.a(this.c, this.f, this.g);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5176b6800ac846858ac8a0cf9d6f89fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5176b6800ac846858ac8a0cf9d6f89fb");
            return;
        }
        if (this.l != null) {
            if (t.a(str)) {
                u.c(this.l);
            } else {
                u.a(this.l);
                this.l.setText(str);
            }
        }
        if (this.i != null) {
            if (t.a(str2)) {
                u.c(this.i);
                return;
            }
            u.a(this.i);
            this.i.setText(str2);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adaf1c7c94ed0c7d014f2e8d7e571a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adaf1c7c94ed0c7d014f2e8d7e571a9d");
            return;
        }
        u.a(this.c);
        u.c(this.f, this.g, this.e);
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3284fc5a5ddc00486de90e0f5e4d2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3284fc5a5ddc00486de90e0f5e4d2b");
            return;
        }
        u.c(this.l, this.i, this.f, this.g);
        u.b(this.c);
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7df9d8c427403efc1e571b364f8965a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7df9d8c427403efc1e571b364f8965a");
            return;
        }
        u.a(this.c, this.f, this.g);
        u.c(this.l, this.i);
    }

    public void b(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1628768dc202f8fbac177877c8a20cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1628768dc202f8fbac177877c8a20cb2");
        } else if (this.d == null || eVar == null) {
        } else {
            b.C0608b a2 = m.a(eVar.d, ImageQualityUtil.b());
            a2.b = this.d.getContext();
            a2.b(com.sankuai.shangou.stone.util.h.a(this.d.getContext())).a(new b.a() { // from class: com.sankuai.waimai.store.viewblocks.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4b46bf172e817fb8fbc6966eafb9922", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4b46bf172e817fb8fbc6966eafb9922");
                    } else {
                        c.this.d.setImageBitmap(bitmap);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ae2b24163db4107ae47edf89de49a71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ae2b24163db4107ae47edf89de49a71");
                    } else {
                        c.this.d.setImageResource(R.drawable.wm_sc_common_poi_error);
                    }
                }
            });
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a16a73561f21be18b0c57b57eda900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a16a73561f21be18b0c57b57eda900");
        } else if (this.c != null) {
            this.c.setSelected(z);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f263388a08eee4f50b3fca180e874f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f263388a08eee4f50b3fca180e874f88");
        } else if (this.f != null) {
            this.f.setSelected(z);
        }
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd1ff37db7e52fa65c98b3f625df8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd1ff37db7e52fa65c98b3f625df8e5");
        } else if (i2 == 0) {
        } else {
            if (this.a != null) {
                this.a.setProgress((i * 100) / i2);
                this.a.setSecondaryProgress(i3);
            }
            if (this.k != null) {
                this.k.setText(ao.a(i2));
            }
            if (this.j != null) {
                this.j.setText(ao.a(i));
            }
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3473a94d114cf39ab949b9f1f68d184b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3473a94d114cf39ab949b9f1f68d184b");
        } else if (this.h != null) {
            this.h.setVisibility(0);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed12dd303f0b8307d87f982f25ea230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed12dd303f0b8307d87f982f25ea230");
        } else if (this.h != null) {
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9b80d565d84402321cdb301b8482f5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9b80d565d84402321cdb301b8482f5");
        } else if (this.m == null) {
        } else {
            int id = view.getId();
            if (id == R.id.player_play_icon) {
                this.m.h();
            } else if (id == R.id.player_mute_toggle) {
                this.m.i();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Object[] objArr = {seekBar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d68e7bd3debe4ea557d36be9e56dda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d68e7bd3debe4ea557d36be9e56dda3");
        } else if (this.m != null) {
            this.m.a(seekBar);
        }
    }
}
