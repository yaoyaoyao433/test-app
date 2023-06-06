package com.meituan.android.ptcommonim.video.play;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.gson.JsonArray;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.mach.HangoutMachContainer;
import com.meituan.android.ptcommonim.mach.e;
import com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.android.ptcommonim.video.play.manager.a;
import com.meituan.android.ptcommonim.video.play.speed.d;
import com.meituan.android.singleton.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.spawn.base.BaseActivity;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.IMUIManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTIMPreviewFragment extends PTIMVideoBaseFragment {
    public static ChangeQuickRedirect c;
    private TextView A;
    private TextView B;
    private TextView C;
    private LinearLayout D;
    private ImageView E;
    private ImageView F;
    private TextView G;
    private TextView H;
    private int I;
    private ProgressBar J;
    private e K;
    private HangoutMachContainer L;
    private boolean M;
    int d;
    public d e;
    private VideoPreviewParam h;
    private com.meituan.android.ptcommonim.video.play.manager.a i;
    private com.meituan.android.ptcommonim.video.widget.c j;
    private boolean k;
    private volatile boolean l;
    private int m;
    private boolean n;
    private int o;
    private RelativeLayout p;
    private ImageView q;
    private ImageView r;
    private MTVideoPlayerView s;
    private ImageView t;
    private ImageView u;
    private LinearLayout v;
    private TextView w;
    private TextView x;
    private SeekBar y;
    private RelativeLayout z;

    public PTIMPreviewFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c29e23b5c3dd730a3e19ef57836801", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c29e23b5c3dd730a3e19ef57836801");
            return;
        }
        this.k = true;
        this.l = false;
        this.n = true;
        this.e = new com.meituan.android.ptcommonim.video.play.speed.c();
        this.o = 1;
        this.M = false;
    }

    public static /* synthetic */ void a(PTIMPreviewFragment pTIMPreviewFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "f231a5804ff4fd347060edc915f923bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "f231a5804ff4fd347060edc915f923bf");
            return;
        }
        Map<String, String> a = com.meituan.android.ptcommonim.video.play.utils.a.a(pTIMPreviewFragment.getContext().getApplicationContext(), str);
        VideoMessage a2 = com.sankuai.xm.imui.common.util.c.a(str, "", System.currentTimeMillis(), (int) NumberUtils.parseLong(a.get("info_duration"), 0L), (short) NumberUtils.parseLong(a.get("info_width"), 0L), (short) NumberUtils.parseLong(a.get("info_height"), 0L), 0L);
        a2.setOperationType(5);
        int a3 = IMUIManager.a().a((IMMessage) a2, false);
        if (a3 != 0) {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_commonbus_send_video_msg", "send_failed", "code:" + a3);
        }
    }

    public static /* synthetic */ void d(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = PTIMVideoBaseFragment.a;
        if (PatchProxy.isSupport(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "394a408c66a8d3a3295c6fad39da6482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "394a408c66a8d3a3295c6fad39da6482");
        } else if (pTIMPreviewFragment.getActivity() instanceof BaseActivity) {
            ((BaseActivity) pTIMPreviewFragment.getActivity()).getSupportFragmentManager().popBackStack();
        }
    }

    public static /* synthetic */ void h(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "291bff789fbeb55a83561f0ff593f9eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "291bff789fbeb55a83561f0ff593f9eb");
            return;
        }
        d dVar = pTIMPreviewFragment.e;
        Object[] objArr2 = {pTIMPreviewFragment};
        ChangeQuickRedirect changeQuickRedirect2 = d.b;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a49243ede5ad79088337cffc33d7b68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a49243ede5ad79088337cffc33d7b68b");
        } else {
            pTIMPreviewFragment.e = dVar.c();
        }
        pTIMPreviewFragment.s.setPlaySpeed(pTIMPreviewFragment.d());
        pTIMPreviewFragment.b();
        pTIMPreviewFragment.c();
    }

    public static /* synthetic */ void m(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "8c29abee0982a3fa18bc4e669100c7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMPreviewFragment, changeQuickRedirect, false, "8c29abee0982a3fa18bc4e669100c7fa");
        } else if (com.meituan.android.ptcommonim.video.utils.a.a(pTIMPreviewFragment)) {
            if (pTIMPreviewFragment.j == null) {
                pTIMPreviewFragment.j = new com.meituan.android.ptcommonim.video.widget.c(pTIMPreviewFragment.getActivity(), 0, false);
                pTIMPreviewFragment.j.a(pTIMPreviewFragment.getString(R.string.ptim_commonbus_video_generating));
            }
            if (pTIMPreviewFragment.j != null) {
                pTIMPreviewFragment.j.a(pTIMPreviewFragment.getActivity());
            }
        }
    }

    public static PTIMPreviewFragment a(VideoPreviewParam videoPreviewParam, PTIMCommonBean pTIMCommonBean) {
        Object[] objArr = {videoPreviewParam, pTIMCommonBean};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4eaa158328ed74114349803aeae70f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PTIMPreviewFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4eaa158328ed74114349803aeae70f0");
        }
        PTIMPreviewFragment pTIMPreviewFragment = new PTIMPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("previewParam", videoPreviewParam);
        bundle.putParcelable("commonBean", pTIMCommonBean);
        pTIMPreviewFragment.setArguments(bundle);
        return pTIMPreviewFragment;
    }

    @Override // com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment, com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65c7730586f6272b7033233041eb117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65c7730586f6272b7033233041eb117");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65ca317a86604514e0abab594855c470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65ca317a86604514e0abab594855c470");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = (VideoPreviewParam) arguments.getParcelable("previewParam");
            if (this.h != null) {
                VideoPreviewParam videoPreviewParam = this.h;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = VideoPreviewParam.a;
                if (PatchProxy.isSupport(objArr3, videoPreviewParam, changeQuickRedirect3, false, "04cb506762ea7fc9fa3a181027b04e51", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, videoPreviewParam, changeQuickRedirect3, false, "04cb506762ea7fc9fa3a181027b04e51")).booleanValue();
                } else if (videoPreviewParam.b != 0 ? videoPreviewParam.b != 1 || TextUtils.isEmpty(videoPreviewParam.c) || ((TextUtils.isEmpty(videoPreviewParam.d) || videoPreviewParam.g <= 0) && !videoPreviewParam.h) : TextUtils.isEmpty(videoPreviewParam.c) || videoPreviewParam.g <= 0) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
        }
        com.meituan.android.ptcommonim.video.utils.a.b(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3681847e009f23a9a67fa7b72e3ca8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3681847e009f23a9a67fa7b72e3ca8") : layoutInflater.inflate(R.layout.ptim_commonbus_video_play, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38355284b64abae536d5eed4ff796e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38355284b64abae536d5eed4ff796e67");
            return;
        }
        super.onViewCreated(view, bundle);
        this.K = new e(getActivity());
        this.p = (RelativeLayout) view.findViewById(R.id.video_bottom_container);
        this.L = (HangoutMachContainer) view.findViewById(R.id.mach_card_container);
        this.q = (ImageView) view.findViewById(R.id.video_top_back);
        this.r = (ImageView) view.findViewById(R.id.video_preview_close_img);
        this.s = (MTVideoPlayerView) view.findViewById(R.id.video_player_view);
        this.t = (ImageView) view.findViewById(R.id.video_cover);
        this.u = (ImageView) view.findViewById(R.id.video_control);
        this.v = (LinearLayout) view.findViewById(R.id.video_bottom_control_container);
        this.w = (TextView) view.findViewById(R.id.video_bottom_current_position);
        this.y = (SeekBar) view.findViewById(R.id.video_bottom_seekbar);
        this.x = (TextView) view.findViewById(R.id.video_bottom_duration);
        this.z = (RelativeLayout) view.findViewById(R.id.video_bottom_send_container);
        this.A = (TextView) view.findViewById(R.id.video_bottom_mute_change_text);
        this.B = (TextView) view.findViewById(R.id.video_bottom_speed_change_text);
        this.C = (TextView) view.findViewById(R.id.video_bottom_send_message);
        this.D = (LinearLayout) view.findViewById(R.id.video_bottom_tools);
        this.E = (ImageView) view.findViewById(R.id.video_bottom_mute_play_btn);
        this.F = (ImageView) view.findViewById(R.id.video_bottom_play_mode_btn);
        this.J = (ProgressBar) view.findViewById(R.id.video_loading);
        this.G = (TextView) view.findViewById(R.id.video_bottom_speed_play_bottom_text);
        this.H = (TextView) view.findViewById(R.id.video_bottom_speed_play_right_text);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "165a3a804428d4250e2fd11c647f8322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "165a3a804428d4250e2fd11c647f8322");
            return;
        }
        String str = this.h.i;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02639851578e0ed7920b33a74294e08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02639851578e0ed7920b33a74294e08f");
        } else {
            JsonArray jsonArray = JsonHelper.toJsonArray(str);
            if (jsonArray != null && jsonArray.size() != 0) {
                this.M = this.L.a(str, this.b, this.h.f, "video");
            }
        }
        if (this.h.b == 1) {
            this.q.setPadding(0, 0, 0, 0);
            this.z.setVisibility(0);
            this.D.setVisibility(8);
            this.G.setVisibility(8);
            this.i = new com.meituan.android.ptcommonim.video.play.manager.a(getActivity(), this.h);
        } else if (this.h.b == 0) {
            this.z.setVisibility(8);
            this.D.setVisibility(0);
            this.G.setVisibility(0);
        }
        if (this.b != null && this.b.userType == PTIMCommonBean.UserType.TYPE_B) {
            this.A.setVisibility(0);
            this.B.setVisibility(0);
        } else {
            this.k = false;
            this.A.setVisibility(8);
            this.B.setVisibility(8);
        }
        try {
            g.a().d(this.h.d).a(this.t);
        } catch (Throwable unused) {
        }
        a(0);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "06bf101d6373377de280e4bcc4e48cc7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "06bf101d6373377de280e4bcc4e48cc7");
                } else if (PTIMPreviewFragment.this.o == 2) {
                    PTIMPreviewFragment.this.F.performClick();
                } else if (PTIMPreviewFragment.this.h.b == 1) {
                    PTIMPreviewFragment.d(PTIMPreviewFragment.this);
                } else if (PTIMPreviewFragment.this.h.b == 0) {
                    com.meituan.android.ptcommonim.video.utils.a.b(PTIMPreviewFragment.this.getActivity());
                }
            }
        });
        this.y.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                Object[] objArr4 = {seekBar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fd7e19aef75146d700ca2cf252754d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fd7e19aef75146d700ca2cf252754d5");
                } else {
                    PTIMPreviewFragment.this.s.a((PTIMPreviewFragment.this.s.getDuration() * seekBar.getProgress()) / 100);
                }
            }
        });
        this.w.setText(com.meituan.android.ptcommonim.video.play.utils.a.a(0L));
        this.x.setText(com.meituan.android.ptcommonim.video.play.utils.a.a(this.h.g, true));
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8eab32bc74fc3aa9c585867b80d51a4c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8eab32bc74fc3aa9c585867b80d51a4c");
                    return;
                }
                PTIMPreviewFragment.this.k = !PTIMPreviewFragment.this.k;
                float f = !PTIMPreviewFragment.this.k ? 1 : 0;
                PTIMPreviewFragment.this.s.a(f, f);
                PTIMPreviewFragment.this.A.setText(PTIMPreviewFragment.this.k ? PTIMPreviewFragment.this.getString(R.string.ptim_commonbus_video_edit_mute_text) : PTIMPreviewFragment.this.getString(R.string.ptim_commonbus_video_edit_unmute_text));
            }
        });
        com.meituan.android.ptcommonim.video.record.utils.b bVar = new com.meituan.android.ptcommonim.video.record.utils.b() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.ptcommonim.video.record.utils.b
            public final void a(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8d2f5dcb0d99a84cbc09934436ce8f5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8d2f5dcb0d99a84cbc09934436ce8f5a");
                } else {
                    PTIMPreviewFragment.h(PTIMPreviewFragment.this);
                }
            }
        };
        this.B.setOnClickListener(bVar);
        this.G.setOnClickListener(bVar);
        this.H.setOnClickListener(bVar);
        this.C.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.c cVar;
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "15bc7bd614ded063c742450fa2103fe3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "15bc7bd614ded063c742450fa2103fe3");
                } else if (com.meituan.android.ptcommonim.video.utils.a.a(PTIMPreviewFragment.this) && !PTIMPreviewFragment.this.l) {
                    PTIMCommonBean pTIMCommonBean = PTIMPreviewFragment.this.b;
                    JSONObject jSONObject = PTIMPreviewFragment.this.h.f;
                    long j = PTIMPreviewFragment.this.h.g;
                    Object[] objArr5 = {pTIMCommonBean, jSONObject, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.video.utils.g.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "46544a824fe58c6f474a0fbe8582633f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "46544a824fe58c6f474a0fbe8582633f");
                    } else {
                        HashMap hashMap = new HashMap();
                        Map<String, Object> a2 = com.meituan.android.ptcommonim.video.utils.g.a(pTIMCommonBean, jSONObject);
                        a2.put("video_complete_duration", Long.valueOf(j / 1000));
                        hashMap.putAll(a2);
                        Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_1bpwrtro_mc", hashMap, "c_group_74zpfj6k");
                    }
                    PTIMPreviewFragment.this.l = true;
                    PTIMPreviewFragment.this.s.f();
                    String str2 = PTIMPreviewFragment.this.h.c;
                    com.meituan.android.ptcommonim.video.play.manager.a aVar = PTIMPreviewFragment.this.i;
                    PTIMPreviewFragment pTIMPreviewFragment = PTIMPreviewFragment.this;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = PTIMPreviewFragment.c;
                    if (PatchProxy.isSupport(objArr6, pTIMPreviewFragment, changeQuickRedirect6, false, "53a6b4683cecdacee6a77a5b448b0574", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar = (d.c) PatchProxy.accessDispatch(objArr6, pTIMPreviewFragment, changeQuickRedirect6, false, "53a6b4683cecdacee6a77a5b448b0574");
                    } else if (pTIMPreviewFragment.e instanceof com.meituan.android.ptcommonim.video.play.speed.c) {
                        cVar = null;
                    } else {
                        d.c cVar2 = new d.c();
                        cVar2.a = pTIMPreviewFragment.e.b();
                        cVar2.b = 0L;
                        cVar2.c = pTIMPreviewFragment.d;
                        cVar = cVar2;
                    }
                    aVar.h = cVar;
                    PTIMPreviewFragment.this.i.f = PTIMPreviewFragment.this.k;
                    PTIMPreviewFragment.this.i.g = new a.b() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.ptcommonim.video.play.manager.a.b
                        public final void a(float f) {
                            Object[] objArr7 = {Float.valueOf(f)};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e0e1ebe5844d02cbf84a300ecbc84ce7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e0e1ebe5844d02cbf84a300ecbc84ce7");
                                return;
                            }
                            com.meituan.android.ptcommonim.video.widget.c cVar3 = PTIMPreviewFragment.this.j;
                            int i = (int) f;
                            Object[] objArr8 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.ptcommonim.video.widget.c.a;
                            if (PatchProxy.isSupport(objArr8, cVar3, changeQuickRedirect8, false, "410ca6c4be2165b8821ed1cfc5ffe49d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, cVar3, changeQuickRedirect8, false, "410ca6c4be2165b8821ed1cfc5ffe49d");
                                return;
                            }
                            TextView textView = cVar3.d;
                            textView.setText(i + "%");
                            cVar3.b.setProgress(i);
                        }

                        @Override // com.meituan.android.ptcommonim.video.play.manager.a.b
                        public final void a(int i, String str3) {
                            Object[] objArr7 = {Integer.valueOf(i), str3};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cf6fe18ebc85a0bd67ba30109e57bb0e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cf6fe18ebc85a0bd67ba30109e57bb0e");
                                return;
                            }
                            if (i == 0) {
                                PTIMPreviewFragment.a(PTIMPreviewFragment.this, str3);
                                com.meituan.android.ptcommonim.video.utils.a.b(PTIMPreviewFragment.this.getActivity());
                            } else {
                                new com.sankuai.meituan.android.ui.widget.a(PTIMPreviewFragment.this.getActivity(), "视频编辑失败，请重试", -1).a();
                            }
                            PTIMPreviewFragment.this.l = false;
                        }
                    };
                    com.meituan.android.ptcommonim.video.play.manager.a aVar2 = PTIMPreviewFragment.this.i;
                    Object[] objArr7 = {str2};
                    ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.ptcommonim.video.play.manager.a.a;
                    if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "802e59fcfda36836959e7f7b8a930294", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "802e59fcfda36836959e7f7b8a930294");
                    } else {
                        com.meituan.android.ptcommonim.video.record.utils.g.a(new a.RunnableC0358a(str2));
                    }
                    PTIMPreviewFragment.m(PTIMPreviewFragment.this);
                }
            }
        });
        this.u.setOnClickListener(a.a(this));
        this.s.setOnClickListener(b.a(this));
        this.E.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4eee27b68ea03c4b0dc2f9b149d96f11", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4eee27b68ea03c4b0dc2f9b149d96f11");
                } else if (PTIMPreviewFragment.this.n) {
                    PTIMPreviewFragment.this.n = false;
                    PTIMPreviewFragment.this.s.a(1.0f, 1.0f);
                    PTIMPreviewFragment.this.E.setImageResource(R.drawable.ptim_commonbus_video_unmute_play_icon);
                } else {
                    PTIMPreviewFragment.this.n = true;
                    PTIMPreviewFragment.this.s.a(0.0f, 0.0f);
                    PTIMPreviewFragment.this.E.setImageResource(R.drawable.ptim_commonbus_video_mute_play_icon);
                }
            }
        });
        this.s.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ceea0f0c7fe296e942a8859763fb5876", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ceea0f0c7fe296e942a8859763fb5876");
                } else {
                    PTIMPreviewFragment.this.a(i);
                }
            }

            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
            public final void a(int i, int i2, int i3) {
                Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "54abfbc7b0819d61e0777f250f177e1b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "54abfbc7b0819d61e0777f250f177e1b");
                    return;
                }
                PTIMPreviewFragment.this.m = i;
                if (i2 > 0) {
                    PTIMPreviewFragment.this.d = i2;
                    PTIMPreviewFragment.this.y.setProgress((i * 100) / i2);
                }
                PTIMPreviewFragment.this.c();
                StringBuilder sb = new StringBuilder("GF---DEBUG---PTIMPreviewFragment.onPlayProgressChange ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(com.meituan.android.ptcommonim.video.play.utils.a.a(PTIMPreviewFragment.this.m / 1, PTIMPreviewFragment.this.m == PTIMPreviewFragment.this.d));
            }
        });
        this.s.setDataSource(new VideoPlayerParam(this.h.c));
        this.s.a(0.0f, 0.0f);
        this.s.setLooping(true);
        this.F.setOnClickListener(c.a(this));
        b();
        String str2 = this.h.i;
        Object[] objArr4 = {str2};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1ca9d89ba80b85a4e7788f3c7763c54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1ca9d89ba80b85a4e7788f3c7763c54d");
        } else if (!TextUtils.isEmpty(str2)) {
            this.F.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.play.PTIMPreviewFragment.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr5 = {view2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8cb5f8d9875982d2e76c5ff9fd6a4f76", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8cb5f8d9875982d2e76c5ff9fd6a4f76");
                    } else {
                        com.meituan.android.ptcommonim.video.utils.a.b(PTIMPreviewFragment.this.getActivity());
                    }
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad5089728e056acc22394039aba64397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad5089728e056acc22394039aba64397");
        } else {
            this.s.performClick();
        }
    }

    @Override // com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b5e506454e786e9173d716437492db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b5e506454e786e9173d716437492db");
            return;
        }
        super.onResume();
        if (this.h.b == 0) {
            com.meituan.android.ptcommonim.video.utils.g.a(this.b, this.h.f, "video", this.M ? "1" : "0");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f1f6cfa7133e350f59e45f19187da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f1f6cfa7133e350f59e45f19187da8");
            return;
        }
        super.onPause();
        if (this.I == 3) {
            this.s.d();
        }
    }

    @Override // com.meituan.android.ptcommonim.video.PTIMVideoBaseFragment
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b501b90247f58a4b91ccd42fed0b4420", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b501b90247f58a4b91ccd42fed0b4420")).booleanValue();
        }
        if (this.j == null || !this.j.a()) {
            if (this.o == 2) {
                this.F.performClick();
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "684f39248f5de0d5313048030a6bcfc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "684f39248f5de0d5313048030a6bcfc1");
            return;
        }
        super.onDestroyView();
        this.K.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "386302bd3c83bf1064a8a255ea7d0053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "386302bd3c83bf1064a8a255ea7d0053");
        } else if (this.j != null) {
            this.j.b();
        }
        this.s.g();
        if (this.i != null) {
            com.meituan.android.ptcommonim.video.play.manager.a aVar = this.i;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.ptcommonim.video.play.manager.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "906376ba796c0fcd84c77982716de0ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "906376ba796c0fcd84c77982716de0ac");
            } else {
                aVar.d.a();
            }
        }
    }

    public static /* synthetic */ void c(PTIMPreviewFragment pTIMPreviewFragment, View view) {
        Object[] objArr = {pTIMPreviewFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09dad5355ef989a465f1813874131c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09dad5355ef989a465f1813874131c4f");
        } else {
            pTIMPreviewFragment.a(true);
        }
    }

    public static /* synthetic */ void b(PTIMPreviewFragment pTIMPreviewFragment, View view) {
        Object[] objArr = {pTIMPreviewFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3df1c6af1e1b74a076483eb092e4608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3df1c6af1e1b74a076483eb092e4608");
        } else {
            pTIMPreviewFragment.a(false);
        }
    }

    public static /* synthetic */ void a(PTIMPreviewFragment pTIMPreviewFragment, View view) {
        Object[] objArr = {pTIMPreviewFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c5170f1e4ca69f232a55b5afd300fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c5170f1e4ca69f232a55b5afd300fec");
        } else if (pTIMPreviewFragment.o == 2) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, pTIMPreviewFragment, changeQuickRedirect2, false, "385aedd4abec45c33829ce76eb031384", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pTIMPreviewFragment, changeQuickRedirect2, false, "385aedd4abec45c33829ce76eb031384");
            } else if (com.meituan.android.ptcommonim.video.utils.a.a(pTIMPreviewFragment.getActivity()) && pTIMPreviewFragment.s != null && pTIMPreviewFragment.h.b != 1) {
                FragmentActivity activity = pTIMPreviewFragment.getActivity();
                ActionBar actionBar = activity.getActionBar();
                if (actionBar != null) {
                    actionBar.show();
                }
                activity.getWindow().clearFlags(1024);
                activity.setRequestedOrientation(7);
                ((RelativeLayout.LayoutParams) pTIMPreviewFragment.v.getLayoutParams()).addRule(0, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pTIMPreviewFragment.D.getLayoutParams();
                layoutParams.addRule(3, pTIMPreviewFragment.z.getId());
                layoutParams.topMargin = 0;
                pTIMPreviewFragment.p.setMinimumHeight(com.meituan.android.ptcommonim.base.util.a.a(104));
                pTIMPreviewFragment.F.setVisibility(0);
                pTIMPreviewFragment.H.setVisibility(8);
                pTIMPreviewFragment.G.setVisibility(0);
            }
            pTIMPreviewFragment.o = 1;
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, pTIMPreviewFragment, changeQuickRedirect3, false, "368225ee2cedd05cd09bbf0214b62dc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, pTIMPreviewFragment, changeQuickRedirect3, false, "368225ee2cedd05cd09bbf0214b62dc4");
            } else if (com.meituan.android.ptcommonim.video.utils.a.a(pTIMPreviewFragment.getActivity()) && pTIMPreviewFragment.s != null && pTIMPreviewFragment.h.b != 1) {
                FragmentActivity activity2 = pTIMPreviewFragment.getActivity();
                ActionBar actionBar2 = activity2.getActionBar();
                if (actionBar2 != null) {
                    actionBar2.hide();
                }
                activity2.getWindow().addFlags(1024);
                activity2.setRequestedOrientation(0);
                ((RelativeLayout.LayoutParams) pTIMPreviewFragment.v.getLayoutParams()).addRule(0, pTIMPreviewFragment.D.getId());
                ((RelativeLayout.LayoutParams) pTIMPreviewFragment.D.getLayoutParams()).addRule(3, 0);
                pTIMPreviewFragment.p.setMinimumHeight(com.meituan.android.ptcommonim.base.util.a.a(60));
                pTIMPreviewFragment.F.setVisibility(8);
                pTIMPreviewFragment.H.setVisibility(0);
                pTIMPreviewFragment.G.setVisibility(8);
            }
            pTIMPreviewFragment.o = 2;
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6368a609b67424d7e387f82574020058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6368a609b67424d7e387f82574020058");
        } else if (this.I != 3) {
            this.s.c();
            if (z) {
                PTIMCommonBean pTIMCommonBean = this.b;
                JSONObject jSONObject = this.h.f;
                String str = this.M ? "1" : "0";
                Object[] objArr2 = {pTIMCommonBean, jSONObject, str};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.video.utils.g.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25440ce1d06d5f02bd44b27a05dbb407", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25440ce1d06d5f02bd44b27a05dbb407");
                    return;
                }
                HashMap hashMap = new HashMap();
                Map<String, Object> a = com.meituan.android.ptcommonim.video.utils.g.a(pTIMCommonBean, jSONObject);
                a.put("show_status", str);
                hashMap.putAll(a);
                Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_3ameqjfs_mc", hashMap, "c_group_plkiwka4");
            }
        } else {
            this.s.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0576e953751e5da476faca3c491cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0576e953751e5da476faca3c491cc0");
            return;
        }
        this.I = i;
        if (i == 3) {
            this.u.setVisibility(8);
            this.t.setVisibility(8);
            this.s.setKeepScreenOn(true);
            this.J.setVisibility(8);
        } else if (i == 1 || i == 2 || i == 6 || i == 5) {
            this.u.setVisibility(8);
            this.J.setVisibility(0);
        } else if (i != 7) {
            this.u.setVisibility(0);
            if (!this.l) {
                this.u.setVisibility(0);
            }
            this.s.setKeepScreenOn(false);
            this.J.setVisibility(8);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffea4d5c3d5a48d5ac8c605d071146b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffea4d5c3d5a48d5ac8c605d071146b");
            return;
        }
        this.B.setText(e());
        this.G.setText(e());
        this.H.setText(e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c82816ea86fa22bb41da8fcb9cb32b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c82816ea86fa22bb41da8fcb9cb32b");
            return;
        }
        float d = this.h.b == 1 ? d() : 1.0f;
        this.w.setText(com.meituan.android.ptcommonim.video.play.utils.a.a(this.m / d, this.m == this.d));
        this.x.setText(com.meituan.android.ptcommonim.video.play.utils.a.a(this.d / d, true));
    }

    private float d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9318e462096d501e1fbcf0329ded93", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9318e462096d501e1fbcf0329ded93")).floatValue() : this.e.a();
    }

    private String e() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7fd0f3dc03ff2c1fa423685d63da89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7fd0f3dc03ff2c1fa423685d63da89");
        }
        com.meituan.android.ptcommonim.video.play.speed.d dVar = this.e;
        if (this.h != null && this.h.b == 1) {
            z = true;
        }
        return dVar.a(z);
    }
}
