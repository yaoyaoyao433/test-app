package com.sankuai.waimai.store.drug.viewblocks;

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
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.ao;
import com.sankuai.waimai.store.util.e;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea2056837a2768c79570225813ffdd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea2056837a2768c79570225813ffdd7");
        } else {
            this.m = aVar;
        }
    }

    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e9b98d2245e38860e9889e07044a6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e9b98d2245e38860e9889e07044a6c");
        }
        this.h = layoutInflater.inflate(a(), viewGroup, false);
        n();
        return this.h;
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496b1660010022fca2d0a367c4ff5c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496b1660010022fca2d0a367c4ff5c40");
            return;
        }
        this.e = (ProgressBar) a(R.id.pb_circle_loading);
        this.l = (TextView) a(R.id.txt_video_tip);
        if (this.l != null) {
            this.l.setBackground(e.b(this.h.getContext(), (int) R.color.wm_sc_good_list_black9, (int) R.dimen.wm_sc_common_dimen_14));
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34f036fc617ce2cb7668dd535cae671", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34f036fc617ce2cb7668dd535cae671") : (T) this.h.findViewById(i);
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fab0e934e4fab17e3d5dd303814364b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fab0e934e4fab17e3d5dd303814364b");
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
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.viewblocks.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec84faa63693371911d029d2d3cc5393", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec84faa63693371911d029d2d3cc5393");
                } else {
                    c.this.m.j();
                }
            }
        });
    }

    public final void a(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d82cc45298f6f31199410e30cd797a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d82cc45298f6f31199410e30cd797a2");
        } else {
            b(eVar);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39fc56ccc4e51ba152758714aa0a19c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39fc56ccc4e51ba152758714aa0a19c0");
        } else {
            u.a(this.e);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c39d3c031420b97a622bbb7decd423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c39d3c031420b97a622bbb7decd423");
        } else {
            u.c(this.e);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118bfeceb4d83951a3dd076ad4310b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118bfeceb4d83951a3dd076ad4310b62");
        } else {
            u.a(this.d);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0caf6b4ebd8762e9312eb1881ade5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0caf6b4ebd8762e9312eb1881ade5d");
        } else {
            u.c(this.d);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0983b49462ee525de600d08053ed6eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0983b49462ee525de600d08053ed6eef");
            return;
        }
        u.c(this.f, this.g);
        u.a(this.e);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c03e18658186cdb1c0b3e5a129ef04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c03e18658186cdb1c0b3e5a129ef04f");
        } else {
            u.c(this.e);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbcafba4bb8507809c7b6b68e27c99c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbcafba4bb8507809c7b6b68e27c99c");
            return;
        }
        u.c(this.e);
        u.a(this.c, this.f, this.g);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689c31e24ecb90b77b09b7982ffca16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689c31e24ecb90b77b09b7982ffca16a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b52d0f7a9ea29ebe3351aa12aad6e3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b52d0f7a9ea29ebe3351aa12aad6e3e");
            return;
        }
        u.a(this.c);
        u.c(this.f, this.g, this.e);
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a46c9ed2b26c3727953230b0078baee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a46c9ed2b26c3727953230b0078baee");
            return;
        }
        u.c(this.l, this.i, this.f, this.g);
        u.b(this.c);
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "324e7e06321e177590e3bf62e8cf0ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "324e7e06321e177590e3bf62e8cf0ac9");
            return;
        }
        u.a(this.c, this.f, this.g);
        u.c(this.l, this.i);
    }

    public void b(com.sankuai.waimai.platform.domain.core.goods.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357e675b44c26abbe397dcdf4748a1ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357e675b44c26abbe397dcdf4748a1ba");
        } else if (this.d == null || eVar == null) {
        } else {
            b.C0608b a2 = m.a(eVar.d, ImageQualityUtil.b());
            a2.b = this.d.getContext();
            a2.b(h.a(this.d.getContext())).a(new b.a() { // from class: com.sankuai.waimai.store.drug.viewblocks.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60a3f3ad66d52c2e89a1d8dd0e109c80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60a3f3ad66d52c2e89a1d8dd0e109c80");
                    } else {
                        c.this.d.setImageBitmap(bitmap);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfc8324fc74725f0e7d365448bcf3644", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfc8324fc74725f0e7d365448bcf3644");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f225e85c1e701e3ba016ecfecbf772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f225e85c1e701e3ba016ecfecbf772");
        } else if (this.c != null) {
            this.c.setSelected(z);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd63c2eedd1373ab3fde6daa3cd29bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd63c2eedd1373ab3fde6daa3cd29bd3");
        } else if (this.f != null) {
            this.f.setSelected(z);
        }
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7797a85ce70fc68ecfe872869ea229f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7797a85ce70fc68ecfe872869ea229f0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13818a5f6c30e175b6e32cf4a31d22c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13818a5f6c30e175b6e32cf4a31d22c6");
        } else if (this.h != null) {
            this.h.setVisibility(0);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6eeb20bb13ea28ff69f3f65d39b39a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6eeb20bb13ea28ff69f3f65d39b39a1");
        } else if (this.h != null) {
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7e1708b0063ac323c0fa4ffcb5c9ed", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7e1708b0063ac323c0fa4ffcb5c9ed");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873cd1018185a97f6fd80ef6ff16a9a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873cd1018185a97f6fd80ef6ff16a9a8");
        } else if (this.m != null) {
            this.m.a(seekBar);
        }
    }
}
