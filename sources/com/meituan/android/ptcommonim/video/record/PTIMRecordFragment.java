package com.meituan.android.ptcommonim.video.record;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.android.ptcommonim.video.model.VideoRecordParam;
import com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment;
import com.meituan.android.ptcommonim.video.record.utils.g;
import com.meituan.android.ptcommonim.video.record.view.RecordProgressView;
import com.meituan.android.ptcommonim.video.utils.h;
import com.meituan.android.ptcommonim.video.widget.b;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.base.BaseActivity;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ColorUtils;
import com.sankuai.meituan.mtlive.ugc.library.MTUgcView;
import com.sankuai.meituan.mtlive.ugc.library.c;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTIMRecordFragment extends PTIMVideoBaseFragment {
    public static ChangeQuickRedirect c;
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private RecordProgressView E;
    private MTUgcView F;
    private LinearLayout G;
    private View H;
    private com.meituan.android.ptcommonim.video.widget.c I;
    private int J;
    private int K;
    private int L;
    private a M;
    private boolean N;
    private com.meituan.android.ptcommonim.video.record.manager.a d;
    private VideoRecordParam e;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private VideoPreviewParam n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private View r;
    private View s;
    private View t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private TextView y;
    private TextView z;

    public PTIMRecordFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069c9d772d8c1d713b287dd9e157bf41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069c9d772d8c1d713b287dd9e157bf41");
            return;
        }
        this.h = 0L;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.J = 0;
        this.N = false;
    }

    public static /* synthetic */ boolean a(PTIMRecordFragment pTIMRecordFragment, boolean z) {
        pTIMRecordFragment.l = true;
        return true;
    }

    public static /* synthetic */ void g(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMRecordFragment, changeQuickRedirect, false, "eecc19cd2092a342bc00428115324d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMRecordFragment, changeQuickRedirect, false, "eecc19cd2092a342bc00428115324d76");
        } else if (com.meituan.android.ptcommonim.video.utils.a.a(pTIMRecordFragment)) {
            FragmentActivity activity = pTIMRecordFragment.getActivity();
            if (pTIMRecordFragment.I == null) {
                pTIMRecordFragment.I = new com.meituan.android.ptcommonim.video.widget.c(activity, 1, false);
                pTIMRecordFragment.I.a(pTIMRecordFragment.getString(R.string.ptim_commonbus_video_generating));
            }
            if (pTIMRecordFragment.I != null) {
                pTIMRecordFragment.I.a(activity);
            }
        }
    }

    public static /* synthetic */ void k(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMRecordFragment, changeQuickRedirect, false, "7652a66e9ac9133e67ce0551f3090b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMRecordFragment, changeQuickRedirect, false, "7652a66e9ac9133e67ce0551f3090b34");
            return;
        }
        pTIMRecordFragment.J = 0;
        pTIMRecordFragment.m = false;
        pTIMRecordFragment.l = false;
        pTIMRecordFragment.a(0L);
        pTIMRecordFragment.c(0);
    }

    public static /* synthetic */ float p(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, pTIMRecordFragment, changeQuickRedirect, false, "691c0ae3b2931d014d15aca5e9f16152", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, pTIMRecordFragment, changeQuickRedirect, false, "691c0ae3b2931d014d15aca5e9f16152")).floatValue() : ((float) pTIMRecordFragment.h) / pTIMRecordFragment.b().h;
    }

    public static /* synthetic */ void t(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMRecordFragment, changeQuickRedirect, false, "db4eac3a559c8211764e6c9a94a45c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMRecordFragment, changeQuickRedirect, false, "db4eac3a559c8211764e6c9a94a45c7b");
        } else {
            pTIMRecordFragment.a((pTIMRecordFragment.L == 0 || pTIMRecordFragment.L == 180) ? 0 : 4, pTIMRecordFragment.A, pTIMRecordFragment.z, pTIMRecordFragment.C, pTIMRecordFragment.B, pTIMRecordFragment.D);
        }
    }

    public static PTIMRecordFragment a(VideoRecordParam videoRecordParam, PTIMCommonBean pTIMCommonBean) {
        Object[] objArr = {videoRecordParam, pTIMCommonBean};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16a49f7476d9a3a65be1a40f6051aa79", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTIMRecordFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16a49f7476d9a3a65be1a40f6051aa79");
        }
        PTIMRecordFragment pTIMRecordFragment = new PTIMRecordFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("recordParam", videoRecordParam);
        bundle.putParcelable("commonBean", pTIMCommonBean);
        pTIMRecordFragment.setArguments(bundle);
        return pTIMRecordFragment;
    }

    @Override // com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment, com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdcd1339e1bcc5bf43c98227f45c07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdcd1339e1bcc5bf43c98227f45c07c");
            return;
        }
        super.onCreate(bundle);
        Log.e("PTIMRecordFragment", "onCreate: " + this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            com.meituan.android.ptcommonim.video.utils.a.b(getActivity());
            return;
        }
        this.e = (VideoRecordParam) arguments.getParcelable("recordParam");
        if (this.e == null) {
            com.meituan.android.ptcommonim.video.utils.a.b(getActivity());
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a05d6a2de2f3d807cdd36dd4f30cf46", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a05d6a2de2f3d807cdd36dd4f30cf46");
        }
        Log.e("PTIMRecordFragment", "onCreateView: " + this);
        View inflate = layoutInflater.inflate(R.layout.ptim_commonbus_video_record_v2, viewGroup, false);
        this.d = new com.meituan.android.ptcommonim.video.record.manager.a();
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97fbcd155a9e6e42dd083db034f8393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97fbcd155a9e6e42dd083db034f8393");
            return;
        }
        super.onViewCreated(view, bundle);
        Log.e("PTIMRecordFragment", "onViewCreated: " + this);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f28ce476c74e4b912a8d5c46d905dd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f28ce476c74e4b912a8d5c46d905dd3e");
        } else {
            this.o = (ImageView) view.findViewById(R.id.record_top_back);
            this.y = (TextView) view.findViewById(R.id.record_top_current_position);
            this.p = (ImageView) view.findViewById(R.id.record_button);
            this.q = (ImageView) view.findViewById(R.id.record_finish_button);
            this.r = view.findViewById(R.id.ll_record_finish);
            this.s = view.findViewById(R.id.ll_delete);
            this.u = (ImageView) view.findViewById(R.id.record_bottom_delete_last);
            this.t = view.findViewById(R.id.ll_upload);
            this.v = (ImageView) view.findViewById(R.id.record_bottom_upload);
            this.F = (MTUgcView) view.findViewById(R.id.record_preview_bg);
            this.G = (LinearLayout) view.findViewById(R.id.record_top_seek_container);
            this.w = (ImageView) view.findViewById(R.id.record_top_light);
            this.x = (ImageView) view.findViewById(R.id.record_top_switch_camera);
            this.H = view.findViewById(R.id.ll_camera_function);
            this.z = (TextView) view.findViewById(R.id.tv_record_top_switch_light);
            this.A = (TextView) view.findViewById(R.id.tv_record_top_switch_camera);
            this.C = (TextView) view.findViewById(R.id.tv_record_bottom_delete_last);
            this.D = (TextView) view.findViewById(R.id.tv_record_bottom_upload);
            this.B = (TextView) view.findViewById(R.id.tv_record_finish_button);
            this.E = (RecordProgressView) view.findViewById(R.id.record_progress_view);
            this.E.setMaxDuration(b().h);
            this.M = new a(getContext().getApplicationContext());
            c(0);
            FragmentActivity activity = getActivity();
            int i = activity.getResources().getDisplayMetrics().widthPixels;
            Object[] objArr3 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.video.record.utils.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1c217a2088532f369c77ea75a9c51c6d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1c217a2088532f369c77ea75a9c51c6d")).booleanValue();
            } else {
                z = activity.getResources().getDisplayMetrics().heightPixels * 9 >= activity.getResources().getDisplayMetrics().widthPixels * 16;
            }
            if (z) {
                ViewGroup.LayoutParams layoutParams = this.F.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = (i * 16) / 9;
                this.F.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.F.getLayoutParams();
                layoutParams2.width = i;
                layoutParams2.height = (i * 4) / 3;
                this.F.setLayoutParams(layoutParams2);
            }
            this.p.setOnClickListener(new com.meituan.android.ptcommonim.video.record.utils.b(600L) { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.1
                public static ChangeQuickRedirect a;

                {
                    super(600L);
                }

                @Override // com.meituan.android.ptcommonim.video.record.utils.b
                public final void a(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "67f26d11ee88f1b5ac836b93f7e07f11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "67f26d11ee88f1b5ac836b93f7e07f11");
                    } else if (PTIMRecordFragment.this.J == 0 || PTIMRecordFragment.this.J == 2 || PTIMRecordFragment.this.J == 3) {
                        com.meituan.android.ptcommonim.video.record.manager.a aVar = PTIMRecordFragment.this.d;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.video.record.manager.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "bd22889512c783112c920e92598310c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "bd22889512c783112c920e92598310c6");
                        } else if (aVar.b == null) {
                            aVar.c(-1);
                        } else if (aVar.e != 1) {
                            if (aVar.d == 0 || aVar.d == -1) {
                                aVar.e = 1;
                                String[] a2 = com.meituan.android.ptcommonim.video.utils.d.a();
                                String str = a2[0];
                                String str2 = a2[1];
                                aVar.b.b().d();
                                if (aVar.b.a(str, str2) == 0) {
                                    aVar.c(1);
                                } else {
                                    aVar.c(-1);
                                }
                            } else if (aVar.d == 2 || aVar.d == 3) {
                                aVar.e = 1;
                                aVar.b.f();
                                aVar.c(1);
                            }
                        }
                    } else if (PTIMRecordFragment.this.J == 1) {
                        PTIMRecordFragment.this.d.a();
                    } else if (PTIMRecordFragment.this.J == 4) {
                        PTIMRecordFragment.this.q.performClick();
                    }
                }
            });
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1dcb5f5875c861caaf55d8f513819537", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1dcb5f5875c861caaf55d8f513819537");
                    } else if (!PTIMRecordFragment.this.j) {
                        new com.sankuai.meituan.android.ui.widget.a(PTIMRecordFragment.this.getActivity(), PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_record_time_min_limit), -1).a();
                    } else {
                        PTIMRecordFragment.a(PTIMRecordFragment.this, true);
                        PTIMRecordFragment.g(PTIMRecordFragment.this);
                        if (PTIMRecordFragment.this.n != null) {
                            PTIMRecordFragment.this.a(PTIMRecordFragment.this.n);
                            return;
                        }
                        com.meituan.android.ptcommonim.video.record.manager.a aVar = PTIMRecordFragment.this.d;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.video.record.manager.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "3ac9f6acccad2ea2e6080a0d11866061", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "3ac9f6acccad2ea2e6080a0d11866061");
                        } else if (aVar.b != null) {
                            if (aVar.d > 0) {
                                aVar.e = 3;
                                com.meituan.android.ptcommonim.video.record.utils.g.a(com.meituan.android.ptcommonim.video.record.manager.b.a(aVar));
                            }
                        }
                    }
                }
            });
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d5993f422452ad0116161769355ac0ba", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d5993f422452ad0116161769355ac0ba");
                    } else if (PTIMRecordFragment.this.J == 1 || PTIMRecordFragment.this.k) {
                    } else {
                        PTIMRecordFragment.this.a(true ^ PTIMRecordFragment.this.i);
                    }
                }
            });
            this.x.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c962342fe93a4543c44735b4cd9e58b0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c962342fe93a4543c44735b4cd9e58b0");
                    } else if (PTIMRecordFragment.this.J != 1) {
                        PTIMRecordFragment.this.b(true ^ PTIMRecordFragment.this.k);
                    }
                }
            });
            this.u.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d9be018f24268187b419f86ff7036e07", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d9be018f24268187b419f86ff7036e07");
                        return;
                    }
                    b.a aVar = new b.a(PTIMRecordFragment.this.getActivity());
                    aVar.c = PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_record_delete_tip);
                    b.a cancel = aVar.cancel(PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_record_delete_cancel));
                    cancel.d = PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_record_delete_confirm);
                    cancel.f = new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.5.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            boolean z2;
                            int i2 = 0;
                            Object[] objArr5 = {view3};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "37620e0198b4f4bcbad140fea592ae92", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "37620e0198b4f4bcbad140fea592ae92");
                                return;
                            }
                            com.meituan.android.ptcommonim.video.record.manager.a aVar2 = PTIMRecordFragment.this.d;
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.ptcommonim.video.record.manager.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "8d1160d03e83095826410a4f76818bde", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "8d1160d03e83095826410a4f76818bde")).booleanValue();
                            } else {
                                z2 = aVar2.b == null || aVar2.b.b() == null || (aVar2.b.b().b() != null && aVar2.b.b().b().size() == 1);
                            }
                            if (z2) {
                                PTIMRecordFragment.this.d.b();
                                PTIMRecordFragment.k(PTIMRecordFragment.this);
                            } else {
                                PTIMRecordFragment.this.N = true;
                                com.meituan.android.ptcommonim.video.record.manager.a aVar3 = PTIMRecordFragment.this.d;
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.ptcommonim.video.record.manager.a.a;
                                if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "ad1759a594b138bace33af5e8ad2a9aa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "ad1759a594b138bace33af5e8ad2a9aa");
                                } else {
                                    if (aVar3.b != null && aVar3.b.b() != null) {
                                        aVar3.b.b().c();
                                    }
                                    aVar3.a(2, true, true);
                                }
                                PTIMRecordFragment.this.N = false;
                                RecordProgressView recordProgressView = PTIMRecordFragment.this.E;
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = RecordProgressView.a;
                                if (PatchProxy.isSupport(objArr8, recordProgressView, changeQuickRedirect8, false, "575d40957d8d5487792b1d659fe2dd2e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, recordProgressView, changeQuickRedirect8, false, "575d40957d8d5487792b1d659fe2dd2e");
                                } else {
                                    new StringBuilder("GF---DEBUG---RecordProgressView.deleteLast total size: ").append(recordProgressView.e.size() / 2);
                                    if (recordProgressView.e.size() >= 2) {
                                        recordProgressView.e.remove(recordProgressView.e.size() - 1);
                                        recordProgressView.f -= recordProgressView.e.remove(recordProgressView.e.size() - 1).a;
                                    }
                                    recordProgressView.invalidate();
                                }
                                PTIMRecordFragment pTIMRecordFragment = PTIMRecordFragment.this;
                                com.meituan.android.ptcommonim.video.record.manager.a aVar4 = PTIMRecordFragment.this.d;
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.ptcommonim.video.record.manager.a.a;
                                if (PatchProxy.isSupport(objArr9, aVar4, changeQuickRedirect9, false, "d25d29780d62aaefe392a7409972311e", RobustBitConfig.DEFAULT_VALUE)) {
                                    i2 = ((Integer) PatchProxy.accessDispatch(objArr9, aVar4, changeQuickRedirect9, false, "d25d29780d62aaefe392a7409972311e")).intValue();
                                } else if (aVar4.b != null && aVar4.b.b() != null) {
                                    i2 = aVar4.b.b().a();
                                }
                                pTIMRecordFragment.a(i2);
                                PTIMRecordFragment.this.p.setImageResource(R.drawable.ptim_commonbus_record_begin_icon);
                            }
                            PTIMRecordFragment.this.n = null;
                        }
                    };
                    cancel.a().a();
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af7ef51eb9d388dd8a587266390ff330", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af7ef51eb9d388dd8a587266390ff330");
                    } else if (PTIMRecordFragment.this.h <= 0) {
                        PTIMRecordFragment.this.d.b();
                        com.meituan.android.ptcommonim.video.utils.a.b(PTIMRecordFragment.this.getActivity());
                    } else {
                        b.a aVar = new b.a(PTIMRecordFragment.this.getActivity());
                        aVar.c = PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_record_back_tip);
                        b.a cancel = aVar.cancel(PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_cancel));
                        cancel.d = PTIMRecordFragment.this.getString(R.string.ptim_commonbus_video_confirm);
                        cancel.f = new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.6.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr5 = {view3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0dafd8a4e4a3d835dc4595c449264369", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0dafd8a4e4a3d835dc4595c449264369");
                                    return;
                                }
                                PTIMRecordFragment.this.d.b();
                                com.meituan.android.ptcommonim.video.utils.a.b(PTIMRecordFragment.this.getActivity());
                            }
                        };
                        cancel.a().a();
                    }
                }
            });
            this.v.setOnClickListener(com.meituan.android.ptcommonim.video.record.a.a(this, activity));
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21a566e51563f9d2010b15079dff2611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21a566e51563f9d2010b15079dff2611");
            return;
        }
        FragmentActivity activity2 = getActivity();
        h.a a2 = com.meituan.android.ptcommonim.video.utils.h.a().a(PermissionGuard.PERMISSION_CAMERA, "pt-4e0dc3a60c94351d", b.a(activity2)).a(PermissionGuard.PERMISSION_MICROPHONE, "pt-4e0dc3a60c94351d", c.a(activity2)).a(PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-4e0dc3a60c94351d", d.a(activity2));
        a2.b = e.a(this);
        a2.a(activity2);
    }

    @Override // com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4161493a8c61992476200356b2958761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4161493a8c61992476200356b2958761");
            return;
        }
        super.onResume();
        Log.e("PTIMRecordFragment", "onResume: " + this);
        if (this.m) {
            this.d.a(b(), this.F);
            b(false);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99095fb8b0621757caabda80d995be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99095fb8b0621757caabda80d995be5");
            return;
        }
        super.onPause();
        Log.e("PTIMRecordFragment", "onPause: " + this);
        try {
            a(false);
        } catch (Throwable unused) {
        }
        if (this.J == 1) {
            this.d.a();
        }
        if (this.d.f) {
            this.m = true;
            com.meituan.android.ptcommonim.video.record.manager.a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.video.record.manager.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "afe796e37c8825e289dd9d1961887d89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "afe796e37c8825e289dd9d1961887d89");
            } else if (aVar.b == null || !aVar.f) {
            } else {
                aVar.f = false;
                aVar.b.a();
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961662db05cf4abda7f5034c0ef349f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961662db05cf4abda7f5034c0ef349f8");
            return;
        }
        super.onStop();
        Log.e("PTIMRecordFragment", "onStop: " + this);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db47d3408a0a775e876c7bf46bb48e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db47d3408a0a775e876c7bf46bb48e4");
            return;
        }
        super.onDestroyView();
        Log.e("PTIMRecordFragment", "onDestroyView: " + this);
        com.meituan.android.ptcommonim.video.record.manager.a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.video.record.manager.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0480cc969dadc7c7d2c91bcb19c2385f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0480cc969dadc7c7d2c91bcb19c2385f");
            return;
        }
        if (aVar.b != null) {
            aVar.b.a((c.b) null);
            aVar.b.d();
            aVar.b = null;
        }
        aVar.c = null;
        aVar.a(0, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8311a547e74018cb74c9ebd7e69b174e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8311a547e74018cb74c9ebd7e69b174e");
            return;
        }
        super.onDestroy();
        Log.e("PTIMRecordFragment", "onDestroy: " + this);
    }

    @Override // com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6311abaac667778e45711a98d3b671f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6311abaac667778e45711a98d3b671f6")).booleanValue();
        }
        if (this.I == null || !this.I.a()) {
            if (this.o.getVisibility() == 0) {
                this.o.performClick();
                return true;
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ void a(PTIMRecordFragment pTIMRecordFragment, Activity activity, View view) {
        Object[] objArr = {pTIMRecordFragment, activity, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8642a26c8b9703bef37027274172e3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8642a26c8b9703bef37027274172e3b2");
            return;
        }
        h.a a2 = com.meituan.android.ptcommonim.video.utils.h.a().a(PermissionGuard.PERMISSION_STORAGE_READ, "pt-4e0dc3a60c94351d", g.a(activity));
        a2.b = h.a(pTIMRecordFragment);
        a2.a(activity);
    }

    public static /* synthetic */ void d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb33109c40c08821269d726b50a4ae1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb33109c40c08821269d726b50a4ae1c");
        } else {
            com.meituan.android.ptcommonim.video.utils.c.a(activity, R.string.ptim_commonbus_permission_read);
        }
    }

    public static /* synthetic */ void b(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = {pTIMRecordFragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6abcd9d9b634a35e984512945592c6a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6abcd9d9b634a35e984512945592c6a5");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, pTIMRecordFragment, changeQuickRedirect2, false, "4b61475d986f8f44fafffefe158ee973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTIMRecordFragment, changeQuickRedirect2, false, "4b61475d986f8f44fafffefe158ee973");
            return;
        }
        PickerBuilder pickerBuilder = new PickerBuilder();
        pickerBuilder.mediaType("video").source("album").maxDuration(pTIMRecordFragment.b().h / 1000).minDuration(pTIMRecordFragment.b().g / 1000).maxCount(1).requestCode(1001).accessToken("pt-4e0dc3a60c94351d").finishCallback(f.a(pTIMRecordFragment));
        MediaWidget.getInstance().openMediaPicker(pTIMRecordFragment.getActivity(), pickerBuilder);
    }

    public static /* synthetic */ void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebeac3adefe3a8638ab0d5d520c20562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebeac3adefe3a8638ab0d5d520c20562");
        } else {
            com.meituan.android.ptcommonim.video.utils.c.a(activity, R.string.ptim_commonbus_permission_camera);
        }
    }

    public static /* synthetic */ void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "573c860d5e2f8f77bc86c0e0feb0f15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "573c860d5e2f8f77bc86c0e0feb0f15e");
        } else {
            com.meituan.android.ptcommonim.video.utils.c.a(activity, R.string.ptim_commonbus_permission_mic);
        }
    }

    public static /* synthetic */ void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b69945d3476da50cef6f2e19322eaf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b69945d3476da50cef6f2e19322eaf8");
        } else {
            com.meituan.android.ptcommonim.video.utils.c.a(activity, R.string.ptim_commonbus_permission_write);
        }
    }

    public static /* synthetic */ void a(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = {pTIMRecordFragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5edf795a9ae9d9cfb1be10de57973d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5edf795a9ae9d9cfb1be10de57973d89");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, pTIMRecordFragment, changeQuickRedirect2, false, "4cc2644693fcc68a0aee242e1298562a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTIMRecordFragment, changeQuickRedirect2, false, "4cc2644693fcc68a0aee242e1298562a");
            return;
        }
        final com.meituan.android.ptcommonim.video.record.manager.a aVar = pTIMRecordFragment.d;
        final Context applicationContext = pTIMRecordFragment.getContext().getApplicationContext();
        Object[] objArr3 = {applicationContext, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.video.record.manager.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "fa9a3d87e5c4a7b55c6c8b73ea9a4ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "fa9a3d87e5c4a7b55c6c8b73ea9a4ae1");
        } else if (aVar.b == null) {
            aVar.b = com.sankuai.meituan.mtlive.ugc.library.b.b(applicationContext, 453197);
            aVar.b.a(0);
            aVar.b.a(new c.b() { // from class: com.meituan.android.ptcommonim.video.record.manager.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.ugc.library.c.b
                public final void a(long j) {
                    Object[] objArr4 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f60af16b62104fee5d373c750306b103", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f60af16b62104fee5d373c750306b103");
                        return;
                    }
                    a aVar2 = aVar;
                    Object[] objArr5 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "678321f988c183dc7906d35e5b0c2642", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "678321f988c183dc7906d35e5b0c2642");
                    } else if (aVar2.c != null) {
                        aVar2.c.a(j);
                    }
                }

                @Override // com.sankuai.meituan.mtlive.ugc.library.c.b
                public final void a(c.C0617c c0617c) {
                    Object[] objArr4 = {c0617c};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "add542404deb4319dfcd1c12dd3bc7e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "add542404deb4319dfcd1c12dd3bc7e8");
                    } else if (c0617c.a == 0 || c0617c.a == 1 || c0617c.a == 2) {
                        g.a((com.meituan.android.ptcommonim.video.record.utils.c) new com.meituan.android.ptcommonim.video.record.task.a(applicationContext, c0617c.c, c0617c.d) { // from class: com.meituan.android.ptcommonim.video.record.manager.a.1.1
                            public static ChangeQuickRedirect a;

                            {
                                AnonymousClass1.this = this;
                            }

                            @Override // com.meituan.android.ptcommonim.video.record.utils.c
                            public final /* synthetic */ void a(com.meituan.android.ptcommonim.video.record.entity.a aVar2) {
                                com.meituan.android.ptcommonim.video.record.entity.a aVar3 = aVar2;
                                Object[] objArr5 = {aVar3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "813aa701ea4da84bb487e41629a96729", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "813aa701ea4da84bb487e41629a96729");
                                    return;
                                }
                                a aVar4 = aVar;
                                Object[] objArr6 = {aVar3};
                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect6, false, "37cb7705b723d075020a30ad9ef279c2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect6, false, "37cb7705b723d075020a30ad9ef279c2");
                                } else if (aVar4.c != null) {
                                    aVar4.c.a(aVar3);
                                }
                            }
                        });
                    } else {
                        com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_commonbus_video_record", "generate_failed", "录制视频失败");
                        aVar.c(-1);
                    }
                }
            });
        }
        pTIMRecordFragment.b(0);
        Object[] objArr4 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, pTIMRecordFragment, changeQuickRedirect4, false, "2787ba9cd048cded09a801e81b2316a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, pTIMRecordFragment, changeQuickRedirect4, false, "2787ba9cd048cded09a801e81b2316a0");
        } else if (pTIMRecordFragment.M != null) {
            if (pTIMRecordFragment.M.canDetectOrientation()) {
                pTIMRecordFragment.M.enable();
            } else {
                pTIMRecordFragment.M.disable();
            }
        }
        pTIMRecordFragment.d.a(pTIMRecordFragment.b(), pTIMRecordFragment.F);
        pTIMRecordFragment.d.c = new com.meituan.android.ptcommonim.video.record.listener.a() { // from class: com.meituan.android.ptcommonim.video.record.PTIMRecordFragment.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.ptcommonim.video.record.listener.a
            public final void a(int i) {
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bd1a1d4161cde14529a9b59cbd7af856", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bd1a1d4161cde14529a9b59cbd7af856");
                    return;
                }
                PTIMRecordFragment.this.J = i;
                PTIMRecordFragment.this.c(PTIMRecordFragment.this.J);
                if (i == -1) {
                    com.meituan.android.ptcommonim.video.utils.a.b(PTIMRecordFragment.this.getActivity());
                }
                if (i == 1) {
                    PTIMRecordFragment.this.F.setKeepScreenOn(true);
                } else {
                    PTIMRecordFragment.this.F.setKeepScreenOn(false);
                }
            }

            @Override // com.meituan.android.ptcommonim.video.record.listener.a
            public final void a(long j) {
                Object[] objArr5 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f5262f26231b8a14a2cef60d38c2de90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f5262f26231b8a14a2cef60d38c2de90");
                    return;
                }
                PTIMRecordFragment.this.a(j);
                StringBuilder sb = new StringBuilder("GF---DEBUG---PTIMRecordFragment.onRecordProgress updateProgress");
                sb.append(PTIMRecordFragment.this.h);
                sb.append(" , ");
                sb.append(PTIMRecordFragment.p(PTIMRecordFragment.this));
            }

            @Override // com.meituan.android.ptcommonim.video.record.listener.a
            public final void a(com.meituan.android.ptcommonim.video.record.entity.a aVar2) {
                Object[] objArr5 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "65b203a7e2bfec659de040001de501a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "65b203a7e2bfec659de040001de501a3");
                } else if (!PTIMRecordFragment.this.l) {
                    PTIMRecordFragment.this.J = 4;
                    PTIMRecordFragment.this.c(4);
                    PTIMRecordFragment.this.n = new VideoPreviewParam(1, PTIMRecordFragment.this.e.f, aVar2.a, aVar2.b, aVar2.c);
                } else {
                    PTIMRecordFragment.this.a(new VideoPreviewParam(1, PTIMRecordFragment.this.e.f, aVar2.a, aVar2.b, aVar2.c));
                }
            }
        };
    }

    private c.d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64127cff7ab669b2b37e4daa5b73a3b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64127cff7ab669b2b37e4daa5b73a3b5");
        }
        c.d dVar = new c.d();
        dVar.e = false;
        dVar.a = 1;
        dVar.g = 3000;
        dVar.h = this.e != null ? (int) this.e.a() : 3000;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VideoPreviewParam videoPreviewParam) {
        Object[] objArr = {videoPreviewParam};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24da90eb9c2b5e56c24fc7b6f29fb39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24da90eb9c2b5e56c24fc7b6f29fb39e");
            return;
        }
        new StringBuilder("GF---DEBUG---PTIMRecordFragment.enterPreviewFragment ").append(videoPreviewParam.toString());
        PTIMPreviewFragment a2 = PTIMPreviewFragment.a(videoPreviewParam, this.b);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = PTIMVideoBaseFragment.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af07c39ea6d8a6518227a83c33972f10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af07c39ea6d8a6518227a83c33972f10");
        } else if (getActivity() instanceof BaseActivity) {
            FragmentTransaction beginTransaction = ((BaseActivity) getActivity()).getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.ptim_video_container, a2);
            beginTransaction.addToBackStack("record_back_stack");
            beginTransaction.commit();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79db069c939d62aa82ea31879904a9ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79db069c939d62aa82ea31879904a9ef");
        } else if (this.I != null) {
            this.I.b();
        }
        this.l = false;
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2cd29265fd8c6664201133735362ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2cd29265fd8c6664201133735362ec");
            return;
        }
        int i2 = 8;
        int i3 = R.drawable.ptim_commonbus_record_begin_icon;
        if (i == 0) {
            this.p.setImageResource(R.drawable.ptim_commonbus_record_begin_icon);
            a(0, this.o, this.H);
            a(4, this.s, this.r, this.G, this.y);
            View view = this.t;
            if (this.b != null && this.b.userType == PTIMCommonBean.UserType.TYPE_B) {
                i2 = 0;
            }
            view.setVisibility(i2);
            this.E.a();
        } else if (i == 1) {
            this.p.setImageResource(R.drawable.ptim_commonbus_record_pause_icon);
            a(4, this.o, this.s, this.r, this.H);
            a(0, this.G, this.y);
            this.t.setVisibility(8);
        } else if (i == 2 || i == 4 || i == 3) {
            ImageView imageView = this.p;
            if (i == 4) {
                i3 = R.drawable.ptim_commonbus_record_end_icon;
            }
            imageView.setImageResource(i3);
            a(0, this.o, this.H, this.r, this.s, this.G, this.y);
            a(i != 4 ? 0 : 4, this.r);
            if (this.N || i == 3) {
                return;
            }
            this.E.b();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a73cb42ea639feea2e7cb78687fabe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a73cb42ea639feea2e7cb78687fabe");
            return;
        }
        this.h = j;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5920f66ee0b4639be1eb255d074a2fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5920f66ee0b4639be1eb255d074a2fbb");
            return;
        }
        this.j = this.h >= PayTask.j;
        this.q.setImageResource(this.j ? R.drawable.ptim_commonbus_record_next_step_enable_icon : R.drawable.ptim_commonbus_record_next_step_disable_icon);
        this.E.setProgress((int) this.h);
        this.y.setText(com.meituan.android.ptcommonim.video.play.utils.a.a(this.h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1f326ba9dbdd760a2892f0dbb2ba52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1f326ba9dbdd760a2892f0dbb2ba52");
        } else if (this.d.a(z)) {
            this.i = z;
            int i = this.k ? R.drawable.ptim_commonbus_record_light_disable_icon : R.drawable.ptim_commonbus_record_light_close_icon;
            if (z) {
                i = R.drawable.ptim_commonbus_record_light_open_icon;
            }
            this.w.setImageResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973f285a08b68afd06d7125f39c0d302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973f285a08b68afd06d7125f39c0d302");
            return;
        }
        if (this.k != z ? this.d.b(z) : true) {
            this.k = z;
            if (this.k) {
                a(false);
            }
            this.w.setImageResource(this.k ? R.drawable.ptim_commonbus_record_light_disable_icon : R.drawable.ptim_commonbus_record_light_close_icon);
            this.z.setTextColor(this.k ? ColorUtils.parseColor("#80CCCCCC", -1) : -1);
            this.z.setShadowLayer(this.k ? 0.0f : 2.0f, 0.0f, 0.0f, ColorUtils.parseColor("#80000000", -1));
        }
    }

    public static /* synthetic */ void a(PTIMRecordFragment pTIMRecordFragment, ArrayList arrayList, int i) {
        Object[] objArr = {pTIMRecordFragment, arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0a3a620df52db48d581a579535ae10a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0a3a620df52db48d581a579535ae10a");
        } else if (CollectionUtils.isEmpty(arrayList)) {
        } else {
            StringBuilder sb = new StringBuilder("GF---DEBUG---PTIMRecordFragment.onResult : ");
            sb.append((String) arrayList.get(0));
            sb.append(" ,size :");
            sb.append(i);
            JSONObject jSONObject = pTIMRecordFragment.e.f;
            Context context = pTIMRecordFragment.getContext();
            String str = (String) arrayList.get(0);
            Object[] objArr2 = {context, str, "pt-4e0dc3a60c94351d"};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.video.utils.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e007e2cd9f88bae287172b5cb8df34d6", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e007e2cd9f88bae287172b5cb8df34d6");
            } else if (!TextUtils.isEmpty(str) && str.startsWith("content")) {
                str = com.meituan.android.ptcommonim.video.utils.d.a(context, Uri.parse(str), "pt-4e0dc3a60c94351d");
            }
            pTIMRecordFragment.a(VideoPreviewParam.a(1, jSONObject, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends OrientationEventListener {
        public static ChangeQuickRedirect a;

        public a(Context context) {
            super(context);
            Object[] objArr = {PTIMRecordFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf02e58165ca95408248c8c5e5ea46e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf02e58165ca95408248c8c5e5ea46e");
            }
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int i2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42472e166701999ae8f4cc172ba0b838", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42472e166701999ae8f4cc172ba0b838");
            } else if (i == -1) {
            } else {
                new StringBuilder("onOrientationChanged() ").append(i);
                int i3 = -90;
                if (i > 340 || i < 20) {
                    if (PTIMRecordFragment.this.K != 0) {
                        PTIMRecordFragment pTIMRecordFragment = PTIMRecordFragment.this;
                        if (PTIMRecordFragment.this.K == -90 || PTIMRecordFragment.this.K == 90 || PTIMRecordFragment.this.K == 180 || PTIMRecordFragment.this.K == -180) {
                            i2 = 0;
                        } else {
                            i2 = PTIMRecordFragment.this.K == 270 ? 360 : -360;
                        }
                        pTIMRecordFragment.a(i2);
                        PTIMRecordFragment.this.K = 0;
                        PTIMRecordFragment.this.L = 0;
                        PTIMRecordFragment.t(PTIMRecordFragment.this);
                        PTIMRecordFragment.this.b(PTIMRecordFragment.this.L);
                        StringBuilder sb = new StringBuilder("orientation: ");
                        sb.append(i);
                        sb.append(", mCurRotation: ");
                        sb.append(PTIMRecordFragment.this.K);
                        sb.append(" , mRotationDegree:");
                        sb.append(PTIMRecordFragment.this.L);
                        return;
                    }
                    return;
                }
                int i4 = -270;
                if (i <= 70 || i >= 110) {
                    if (i <= 250 || i >= 290 || PTIMRecordFragment.this.K == 90 || PTIMRecordFragment.this.K == -270) {
                        return;
                    }
                    PTIMRecordFragment.this.a((PTIMRecordFragment.this.K == 0 || PTIMRecordFragment.this.K == 180 || PTIMRecordFragment.this.K == 270) ? 90 : -270);
                    PTIMRecordFragment.this.K = (PTIMRecordFragment.this.K == 0 || PTIMRecordFragment.this.K == 180 || PTIMRecordFragment.this.K == 270) ? 90 : 90;
                    PTIMRecordFragment.this.L = 90;
                    PTIMRecordFragment.t(PTIMRecordFragment.this);
                    PTIMRecordFragment.this.b(PTIMRecordFragment.this.L);
                    StringBuilder sb2 = new StringBuilder("orientation: ");
                    sb2.append(i);
                    sb2.append(", mCurRotation: ");
                    sb2.append(PTIMRecordFragment.this.K);
                    sb2.append(" , mRotationDegree:");
                    sb2.append(PTIMRecordFragment.this.L);
                } else if (PTIMRecordFragment.this.K == -90 || PTIMRecordFragment.this.K == 270) {
                } else {
                    PTIMRecordFragment.this.a((PTIMRecordFragment.this.K == 0 || PTIMRecordFragment.this.K == -180 || PTIMRecordFragment.this.K == -270) ? -90 : 270);
                    PTIMRecordFragment pTIMRecordFragment2 = PTIMRecordFragment.this;
                    if (PTIMRecordFragment.this.K != 0 && PTIMRecordFragment.this.K != -180 && PTIMRecordFragment.this.K != -270) {
                        i3 = 270;
                    }
                    pTIMRecordFragment2.K = i3;
                    PTIMRecordFragment.this.L = 270;
                    PTIMRecordFragment.t(PTIMRecordFragment.this);
                    PTIMRecordFragment.this.b(PTIMRecordFragment.this.L);
                    StringBuilder sb3 = new StringBuilder("orientation: ");
                    sb3.append(i);
                    sb3.append(", mCurRotation: ");
                    sb3.append(PTIMRecordFragment.this.K);
                    sb3.append(" , mRotationDegree:");
                    sb3.append(PTIMRecordFragment.this.L);
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab40728464e21887f82559834122315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab40728464e21887f82559834122315");
        } else {
            a(300, this.K, i, this.o, this.p, this.q, this.y, this.u, this.w, this.x, this.v);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4cc4a9a2bca21020350c8f22371095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4cc4a9a2bca21020350c8f22371095");
        } else if (this.h == 0) {
            this.d.a(i);
            this.d.b(i);
        }
    }

    private void a(int i, float f, float f2, View... viewArr) {
        int i2 = 4;
        char c2 = 1;
        Object[] objArr = {300, Float.valueOf(f), Float.valueOf(f2), viewArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22db6e347cbd4b272a398ed9b92bcb56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22db6e347cbd4b272a398ed9b92bcb56");
            return;
        }
        String.format("GF---DEBUG---PTIMRecordFragment.rotateViews from:%f, to:%f, ", Float.valueOf(f), Float.valueOf(f2));
        int i3 = 0;
        while (i3 < 8) {
            View view = viewArr[i3];
            Object[] objArr2 = new Object[i2];
            objArr2[0] = 300;
            objArr2[c2] = Float.valueOf(f);
            objArr2[2] = Float.valueOf(f2);
            objArr2[3] = view;
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "227bfddc46918c4856518b5bb7541e11", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "227bfddc46918c4856518b5bb7541e11");
            } else {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, RecceAnimUtils.ROTATION, f, f2);
                ofFloat.setDuration(300);
                ofFloat.start();
            }
            i3++;
            i2 = 4;
            c2 = 1;
        }
    }

    private void a(int i, View... viewArr) {
        Object[] objArr = {Integer.valueOf(i), viewArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d0c2288dee347851c2426d37f6fe9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d0c2288dee347851c2426d37f6fe9e");
            return;
        }
        for (View view : viewArr) {
            view.setVisibility(i);
        }
    }
}
