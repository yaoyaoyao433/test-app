package com.sankuai.waimai.ugc.creator.component;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.waimai.ugc.creator.ability.album.utils.a;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.sankuai.waimai.ugc.creator.widgets.RecordButton;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.waimai.ugc.creator.base.b implements com.sankuai.waimai.ugc.creator.handler.f {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private RooImageView c;
    private RecordButton d;
    private TextView e;
    private TextView f;
    private RelativeLayout g;
    private com.sankuai.waimai.ugc.creator.ability.album.utils.b h;
    private final DecimalFormat i;
    private boolean j;
    private com.sankuai.waimai.ugc.creator.ability.album.utils.a k;
    private int l;
    private int m;
    private long z;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5864b92b705b00a02f126eec030e38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5864b92b705b00a02f126eec030e38");
        } else {
            this.i = new DecimalFormat("###.0");
        }
    }

    public static /* synthetic */ void a(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "0eac1df1fff7a16dfb200b3c72268042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "0eac1df1fff7a16dfb200b3c72268042");
        } else if (o.a(eVar.B())) {
            eVar.a(new Bundle(), "wm_router://page/wmvideoselect", 11);
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418c9e7ad9f24220da21b2eab5381610", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418c9e7ad9f24220da21b2eab5381610") : layoutInflater.inflate(R.layout.wm_ugc_camera_video_control_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        boolean z = true;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5564a5bd369723e0b0e934cd24fa138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5564a5bd369723e0b0e934cd24fa138");
            return;
        }
        super.a(view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d5a5a538abb4bd02068cccd3b9167b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d5a5a538abb4bd02068cccd3b9167b0");
        } else {
            this.j = (this.o.b == 2 && this.o.c == 2) ? false : false;
            this.l = this.o.m;
            this.m = this.o.n;
            this.h = new com.sankuai.waimai.ugc.creator.ability.album.utils.b(A(), "ugccreator_ugc_icon_camera_album_default");
            this.c = (RooImageView) b(R.id.wm_ugc_camera_album_entrance_img);
            this.b = (LinearLayout) b(R.id.wm_ugc_camera_album_layout);
            this.g = (RelativeLayout) b(R.id.wm_ugc_camera_layout_summary_time);
            this.g.setVisibility(4);
            this.e = (TextView) b(R.id.ugc_plus_record_segment_video_fragment_record_time_view_one);
            this.f = (TextView) b(R.id.ugc_plus_record_segment_video_fragment_record_time_view_two);
            this.d = (RecordButton) b(R.id.wm_ugc_camera_layout_record_button);
            if (this.j) {
                this.b.setVisibility(0);
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0bd542c727216741151050d9f0d34cfb", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0bd542c727216741151050d9f0d34cfb");
                            return;
                        }
                        com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                        Activity B = e.this.B();
                        Object[] objArr4 = {B};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.judas.e.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "af649397c383fd24f90775a5a2bafe7b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "af649397c383fd24f90775a5a2bafe7b");
                        } else if (a2.b != null) {
                            a2.a(a2.b.z, a2.b.b, (Map<String, Object>) null, B);
                        }
                        e.a(e.this);
                    }
                });
            } else {
                this.b.setVisibility(8);
            }
            this.d.setRecordButtonStateListener(new RecordButton.a() { // from class: com.sankuai.waimai.ugc.creator.component.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.widgets.RecordButton.a
                public final boolean a() {
                    boolean z2;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1609097e9270ed52b34d49b7938ce5bd", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1609097e9270ed52b34d49b7938ce5bd")).booleanValue();
                    }
                    com.sankuai.waimai.ugc.creator.judas.e a2 = com.sankuai.waimai.ugc.creator.judas.e.a();
                    Activity B = e.this.B();
                    Object[] objArr4 = {B};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.judas.e.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "053bdd20051913e2a78fc260d2629ee9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "053bdd20051913e2a78fc260d2629ee9");
                    } else if (a2.b != null) {
                        a2.a(a2.b.l, a2.b.b, (Map<String, Object>) null, B);
                    }
                    com.sankuai.waimai.ugc.creator.manager.g a3 = com.sankuai.waimai.ugc.creator.manager.g.a();
                    Object[] objArr5 = {e.this.B()};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.manager.g.a;
                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "70cb003f8e2e25ca73696cebc91e2530", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "70cb003f8e2e25ca73696cebc91e2530")).booleanValue();
                    } else {
                        String[] b = com.sankuai.waimai.ugc.creator.utils.f.b();
                        String str = b[0];
                        String str2 = b[1];
                        Object[] objArr6 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.ugc.creator.manager.g.a;
                        if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "bf4616749a1ad8a949a1d2634963d09e", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "bf4616749a1ad8a949a1d2634963d09e")).booleanValue();
                        } else {
                            n.a("startRecord");
                            if (a3.b == null || a3.f) {
                                n.a("startRecord->IMTUgcRecord is null");
                                a3.a(-100);
                            } else {
                                a3.b.b().d();
                                int a4 = a3.b.a(str, str2);
                                a3.e = a4 == 0;
                                n.a("startRecord->result:" + a4);
                                if (a3.e) {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.ugc.creator.manager.g.a;
                                    if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "7d73452488de98a41a7254c345032002", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "7d73452488de98a41a7254c345032002");
                                    } else if (a3.c != null) {
                                        a3.c.g();
                                    }
                                    z2 = true;
                                } else {
                                    a3.a(a4);
                                }
                            }
                            z2 = false;
                        }
                    }
                    if (z2) {
                        if (e.this.j) {
                            e.this.b.setVisibility(8);
                        }
                        e.this.g.setVisibility(0);
                    }
                    return z2;
                }

                @Override // com.sankuai.waimai.ugc.creator.widgets.RecordButton.a
                public final boolean b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f85f6b53a5bf5f3cfbf48cd87ccd604", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f85f6b53a5bf5f3cfbf48cd87ccd604")).booleanValue();
                    }
                    if (e.this.z < e.this.l) {
                        e.this.b(e.this.B().getString(R.string.wm_ugc_video_record_less_than_min_duration, new Object[]{Integer.valueOf(e.this.l / 1000)}));
                        return false;
                    }
                    com.sankuai.waimai.ugc.creator.manager.g a2 = com.sankuai.waimai.ugc.creator.manager.g.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ugc.creator.manager.g.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "2b2577475574d71bd78404f526c1ad75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "2b2577475574d71bd78404f526c1ad75");
                    } else {
                        n.a("stopRecord");
                        if (a2.b != null && a2.e) {
                            int c = a2.b.c();
                            boolean z2 = c == 0;
                            a2.e = false;
                            n.a("stopRecord->resultCode:" + c);
                            if (z2) {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.ugc.creator.manager.g.a;
                                if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "a2856913f113b0ca78cb7dda6b8f5b4c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "a2856913f113b0ca78cb7dda6b8f5b4c");
                                } else if (a2.c != null) {
                                    a2.c.j();
                                }
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.ugc.creator.manager.g.a;
                                if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "4bd5f658be7b46a4c9bd5081ab9d5f91", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "4bd5f658be7b46a4c9bd5081ab9d5f91");
                                } else if (a2.c != null) {
                                    a2.c.m();
                                }
                            } else {
                                a2.a(c);
                            }
                        }
                    }
                    if (e.this.j) {
                        e.this.b.setVisibility(0);
                    }
                    e.this.g.setVisibility(8);
                    return true;
                }
            });
            this.e.setText("0.0s");
            TextView textView = this.f;
            textView.setText(b(this.m) + "s");
        }
        if (this.j) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36fcaafa20ea6fa0dbed38039a757be3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36fcaafa20ea6fa0dbed38039a757be3");
                return;
            }
            this.c.setImageDrawable(this.h.a(A(), "ugccreator_ugc_icon_camera_album_default"));
            Bundle bundle = new Bundle();
            bundle.putLong("minSelectDuration", this.o.k);
            bundle.putLong("maxSelectDuration", this.o.l);
            com.sankuai.waimai.ugc.creator.ability.album.utils.a aVar = new com.sankuai.waimai.ugc.creator.ability.album.utils.a(A());
            aVar.e = 2;
            com.sankuai.waimai.ugc.creator.ability.album.utils.a a2 = aVar.a(this.o.k, this.o.l);
            a2.h = new a.InterfaceC1360a() { // from class: com.sankuai.waimai.ugc.creator.component.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.InterfaceC1360a
                public final void a(int i, List<com.sankuai.waimai.ugc.creator.entity.inner.a> list) {
                    Object[] objArr4 = {Integer.valueOf(i), list};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f4cd0ff0c2e841f5cc77d202b0a1abe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f4cd0ff0c2e841f5cc77d202b0a1abe");
                        return;
                    }
                    com.sankuai.waimai.ugc.creator.entity.inner.a aVar2 = list.get(0);
                    if (!o.a(e.this.B()) || aVar2 == null || com.sankuai.waimai.foundation.utils.b.b(aVar2.d)) {
                        return;
                    }
                    RequestCreator a3 = Picasso.g(e.this.B()).d(aVar2.d.get(0).h).e().a(com.sankuai.waimai.foundation.utils.g.a(e.this.B(), 32.0f), com.sankuai.waimai.foundation.utils.g.a(e.this.B(), 32.0f));
                    a3.i = e.this.h.a(e.this.A(), "ugccreator_ugc_icon_camera_album_default");
                    a3.j = e.this.h.a(e.this.A(), "ugccreator_ugc_icon_camera_album_default");
                    a3.a(e.this.c);
                }
            };
            this.k = a2;
            this.k.a();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.handler.f
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41702e4ebc2745b84ca87a66c4748801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41702e4ebc2745b84ca87a66c4748801");
            return;
        }
        this.z = j;
        TextView textView = this.e;
        textView.setText(b(j) + "s");
        RecordButton recordButton = this.d;
        int i = this.m;
        int i2 = (int) j;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = RecordButton.a;
        if (PatchProxy.isSupport(objArr2, recordButton, changeQuickRedirect2, false, "ae703bdcdd5d6fe926acb853c522f343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recordButton, changeQuickRedirect2, false, "ae703bdcdd5d6fe926acb853c522f343");
        } else if (recordButton.b == 2) {
            recordButton.setProgress((i2 * 360.0f) / i);
        }
    }

    private float b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499a7c8361dc22cc2fb5230b42c17833", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499a7c8361dc22cc2fb5230b42c17833")).floatValue();
        }
        if (j % 1000 == 0) {
            return (float) (j / 1000);
        }
        return Float.parseFloat(this.i.format(((float) j) / 1000.0f));
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dc17e34528e1b85108a133a144a2a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dc17e34528e1b85108a133a144a2a7");
            return;
        }
        super.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "652a8d5ac0deab6b36676174034c005a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "652a8d5ac0deab6b36676174034c005a");
            return;
        }
        RecordButton recordButton = this.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = RecordButton.a;
        if (PatchProxy.isSupport(objArr3, recordButton, changeQuickRedirect3, false, "b1e5c26c4620206a17b60717949a78fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, recordButton, changeQuickRedirect3, false, "b1e5c26c4620206a17b60717949a78fe");
        } else {
            recordButton.b = 1;
            recordButton.a();
            recordButton.c.setImageResourceByResName("ugccreator_ugc_media_record_begin_icon");
        }
        this.e.setText("0.0s");
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3ad84a6a30babaa6ab885bf7dcab9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3ad84a6a30babaa6ab885bf7dcab9f");
            return;
        }
        super.o();
        com.sankuai.waimai.ugc.creator.manager.g a2 = com.sankuai.waimai.ugc.creator.manager.g.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ugc.creator.manager.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e07fcd41b85b84360ecd4b315589e2d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e07fcd41b85b84360ecd4b315589e2d7");
        } else if (a2.b == null || !a2.e) {
        } else {
            a2.b.e();
            a2.e = false;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.ugc.creator.manager.g.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0df149ede28e9d95f7ec17f7b19c34bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0df149ede28e9d95f7ec17f7b19c34bb");
            } else if (a2.c != null) {
                a2.c.i();
            }
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4b201827ce2db6d960135e5902b62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4b201827ce2db6d960135e5902b62f");
            return;
        }
        super.b();
        if (this.k != null) {
            this.k.c();
        }
    }
}
