package com.meituan.android.yoda.fragment.voiceprint;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.config.ui.d;
import com.meituan.android.yoda.data.b;
import com.meituan.android.yoda.fragment.VoicePrintVerifyFragment;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.c;
import com.meituan.android.yoda.util.i;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.widget.view.BaseButton;
import com.meituan.android.yoda.widget.view.BaseImageView;
import com.meituan.android.yoda.widget.view.BaseTextView;
import com.meituan.android.yoda.widget.view.VoicePrintView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VoicePrintSubFragment2 extends Fragment implements TextToSpeech.OnInitListener, View.OnClickListener, VoicePrintView.a, VoicePrintView.b {
    public static ChangeQuickRedirect a;
    public VoicePrintVerifyFragment b;
    public Handler c;
    public long d;
    public long e;
    private View f;
    private BaseTextView g;
    private BaseImageView h;
    private BaseButton i;
    private View j;
    private TextToSpeech k;
    private boolean l;
    private StringBuilder m;
    private String n;
    private String o;
    private c p;
    private Runnable q;

    public VoicePrintSubFragment2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe93c8db841eaa4af839aa93fabadeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe93c8db841eaa4af839aa93fabadeb");
            return;
        }
        this.l = false;
        this.m = new StringBuilder();
        this.d = 0L;
        this.e = 0L;
        this.q = new Runnable() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34c9e4a3f2cefcda5fa0cf92b9926f99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34c9e4a3f2cefcda5fa0cf92b9926f99");
                    return;
                }
                synchronized (VoicePrintSubFragment2.this.k) {
                    String sb = VoicePrintSubFragment2.this.m.toString();
                    if (VoicePrintSubFragment2.this.l && VoicePrintSubFragment2.this.k != null && !TextUtils.isEmpty(sb)) {
                        TextToSpeech textToSpeech = VoicePrintSubFragment2.this.k;
                        textToSpeech.speak(sb, 1, null, sb + System.currentTimeMillis());
                        VoicePrintSubFragment2.this.m.delete(0, VoicePrintSubFragment2.this.m.length() - 1);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends View.AccessibilityDelegate {
        public static ChangeQuickRedirect a;
        private String c;

        public a(String str) {
            Object[] objArr = {VoicePrintSubFragment2.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c098fc87d7f88d2d742d10f3f3b9c242", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c098fc87d7f88d2d742d10f3f3b9c242");
            } else {
                this.c = TextUtils.isEmpty(str) ? "" : str;
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object[] objArr = {view, accessibilityNodeInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f47686a80979def1fb70dcb0cea2e30", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f47686a80979def1fb70dcb0cea2e30");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(TextView.class.getName());
            accessibilityNodeInfo.setContentDescription(x.a((int) R.string.yoda_voice_verify_number_area) + a(this.c));
        }

        private String a(String str) {
            int i = 0;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21b91df93362954e3132e7ccc70e1be", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21b91df93362954e3132e7ccc70e1be");
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str.length() <= 6) {
                StringBuilder sb = new StringBuilder();
                while (i < str.length()) {
                    int i2 = i + 1;
                    sb.append(str.substring(i, i2));
                    sb.append(StringUtil.SPACE);
                    i = i2;
                }
                return sb.toString();
            }
            return str;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab945db37abd36a33e0311c3000a45ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab945db37abd36a33e0311c3000a45ba");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.n = getArguments().getString("param1");
            this.o = getArguments().getString("param2");
        }
        this.p = new c(getContext());
        this.p.k = this;
        if (this.b.k) {
            this.k = new TextToSpeech(getContext(), this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb05d673283eb0b735d28b6f512a96e1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb05d673283eb0b735d28b6f512a96e1") : layoutInflater.inflate(R.layout.fragment_voice_print_sub_fragment2, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8514fc299dc93a8cd4c7cdf658dcedd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8514fc299dc93a8cd4c7cdf658dcedd9");
            return;
        }
        this.j = view;
        this.c = new Handler(Looper.getMainLooper());
        this.g = (BaseTextView) view.findViewById(R.id.info_text);
        this.h = (BaseImageView) view.findViewById(R.id.info_img);
        this.f = view.findViewById(R.id.tv_tips);
        if (this.b.k) {
            this.g.setVisibility(0);
            this.g.setOnClickListener(this);
        } else {
            this.h.setVisibility(0);
            this.h.setOnClickListener(this);
        }
        this.i = (BaseButton) view.findViewById(R.id.btn_voice_print);
        this.i.setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                Object[] objArr2 = {view2, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c0c91abba94c312d6e214fe1da01fab", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c0c91abba94c312d6e214fe1da01fab")).booleanValue();
                }
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        VoicePrintSubFragment2.this.d = System.currentTimeMillis();
                        VoicePrintSubFragment2.this.p.a();
                        VoicePrintSubFragment2.this.a();
                        if (!d.a().r() || VoicePrintSubFragment2.this.b == null) {
                            VoicePrintSubFragment2.this.i.setBackgroundResource(R.drawable.yoda_btn_verify_mt_enable_active_background);
                            break;
                        } else {
                            VoicePrintSubFragment2.this.b.a(VoicePrintSubFragment2.this.i, 2);
                            break;
                        }
                    case 1:
                        VoicePrintSubFragment2.this.e = System.currentTimeMillis();
                        if (VoicePrintSubFragment2.this.e - VoicePrintSubFragment2.this.d >= 8000) {
                            VoicePrintSubFragment2.this.c();
                            VoicePrintSubFragment2.this.b();
                            VoicePrintSubFragment2.this.p.a(true);
                        } else if (VoicePrintSubFragment2.this.e - VoicePrintSubFragment2.this.d <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                            VoicePrintSubFragment2.this.b();
                            VoicePrintSubFragment2.this.d();
                            VoicePrintSubFragment2.this.p.a(true);
                        } else {
                            VoicePrintSubFragment2.this.b();
                            VoicePrintSubFragment2.this.p.a(false);
                        }
                        if (!d.a().r() || VoicePrintSubFragment2.this.b == null) {
                            VoicePrintSubFragment2.this.i.setBackgroundResource(R.drawable.yoda_btn_veify_mt_enable_background);
                            break;
                        } else {
                            VoicePrintSubFragment2.this.b.a(VoicePrintSubFragment2.this.i, 1);
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (this.b != null) {
            this.b.a((Button) this.i);
        }
        e();
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c120d46ee2586574b720fbc9197991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c120d46ee2586574b720fbc9197991");
            return;
        }
        super.onAttach(context);
        this.b = (VoicePrintVerifyFragment) getParentFragment();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853d4aff3d275d021d752b7849807cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853d4aff3d275d021d752b7849807cb4");
            return;
        }
        super.onDestroy();
        if (this.k != null) {
            this.k.shutdown();
        }
    }

    @Override // com.meituan.android.yoda.widget.view.VoicePrintView.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8990f3f9d500c51c3f11d345a479f899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8990f3f9d500c51c3f11d345a479f899");
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tips_faded_out_anim);
        this.f.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.3
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "144f0f2ecbb8b6a30ad3838363daca15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "144f0f2ecbb8b6a30ad3838363daca15");
                } else {
                    VoicePrintSubFragment2.this.f.setVisibility(4);
                }
            }
        });
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.caption_transca_in_animator);
        if (this.b.k) {
            loadAnimator.setTarget(this.g);
        } else {
            loadAnimator.setTarget(this.h);
        }
        loadAnimator.start();
    }

    @Override // com.meituan.android.yoda.widget.view.VoicePrintView.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63582aff2ef2f02b64df832ee7a885b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63582aff2ef2f02b64df832ee7a885b");
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tips_faded_in_anim);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.4
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "556f73491ae95d2ca28dfe50dd70337f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "556f73491ae95d2ca28dfe50dd70337f");
                } else {
                    VoicePrintSubFragment2.this.f.setVisibility(0);
                }
            }
        });
        this.f.startAnimation(loadAnimation);
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.caption_transca_out_animator);
        if (this.b.k) {
            loadAnimator.setTarget(this.g);
        } else {
            loadAnimator.setTarget(this.h);
        }
        loadAnimator.start();
    }

    @Override // com.meituan.android.yoda.widget.view.VoicePrintView.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5584bca42f219983d90ec3cc3f451e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5584bca42f219983d90ec3cc3f451e5a");
        } else {
            x.a(getActivity(), x.a((int) R.string.yoda_voice_verify_record_over_time));
        }
    }

    @Override // com.meituan.android.yoda.widget.view.VoicePrintView.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f487190be9a4aca3c6ea0d5772dfc122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f487190be9a4aca3c6ea0d5772dfc122");
        } else {
            x.a(getActivity(), x.a((int) R.string.yoda_voice_verify_record_short_time));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a364d4834e1fc3514ad2931d36dbce", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a364d4834e1fc3514ad2931d36dbce");
        } else if (view.getId() == R.id.info_img) {
            e();
        } else if (view.getId() == R.id.info_text) {
            e();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688c367e168b8a0ce462ce679856b0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688c367e168b8a0ce462ce679856b0f0");
        } else if (this.b != null) {
            f();
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f5d4ce465442a41ac86ff72009d0ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f5d4ce465442a41ac86ff72009d0ae");
            return;
        }
        if (this.b.k) {
            c("");
        } else {
            this.b.a();
        }
        this.b.a((HashMap<String, String>) null, new h<YodaResult>() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.h
            public final /* synthetic */ void a(String str, @NonNull YodaResult yodaResult) {
                YodaResult yodaResult2 = yodaResult;
                Object[] objArr2 = {str, yodaResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cb00ecd8e18eee89e68f5d43822bc19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cb00ecd8e18eee89e68f5d43822bc19");
                    return;
                }
                if (!VoicePrintSubFragment2.this.b.k) {
                    VoicePrintSubFragment2.this.b.b();
                }
                if (yodaResult2.data == null) {
                    if (VoicePrintSubFragment2.this.b != null) {
                        VoicePrintSubFragment2.this.b.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 703);
                    }
                } else {
                    Map map = (Map) yodaResult2.data.get("prompt");
                    if (VoicePrintSubFragment2.this.b.k) {
                        String str2 = (String) map.get("v");
                        if (TextUtils.isEmpty(str2)) {
                            VoicePrintSubFragment2.this.a(x.a((int) R.string.yoda_voice_verify_info_fail));
                            if (VoicePrintSubFragment2.this.b != null) {
                                VoicePrintSubFragment2.this.b.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 703);
                            }
                        } else {
                            String a2 = com.meituan.android.yoda.xxtea.d.a(str2, str);
                            VoicePrintSubFragment2.this.g.setText(a2);
                            VoicePrintSubFragment2.this.c(a2);
                            if (!TextUtils.isEmpty(a2)) {
                                VoicePrintSubFragment2.this.b(x.a((int) R.string.yoda_voice_verify_number_updated_message));
                            } else {
                                VoicePrintSubFragment2.this.a(x.a((int) R.string.yoda_voice_verify_info_fail));
                                if (VoicePrintSubFragment2.this.b != null) {
                                    VoicePrintSubFragment2.this.b.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 703);
                                }
                            }
                        }
                    } else {
                        try {
                            String str3 = (String) map.get("voicetext");
                            if (!TextUtils.isEmpty(str3)) {
                                VoicePrintSubFragment2.this.h.setImageBitmap(i.a(str3));
                            } else {
                                VoicePrintSubFragment2.this.a(x.a((int) R.string.yoda_voice_verify_info_fail));
                            }
                        } catch (Exception unused) {
                            VoicePrintSubFragment2.this.a(x.a((int) R.string.yoda_voice_verify_info_fail));
                            if (VoicePrintSubFragment2.this.b != null) {
                                VoicePrintSubFragment2.this.b.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 703);
                            }
                        }
                    }
                }
                if (VoicePrintSubFragment2.this.b != null) {
                    VoicePrintSubFragment2.this.b.d("yoda_voice_verify_page_launch", "voice_fragment2");
                }
            }

            @Override // com.meituan.android.yoda.interfaces.h
            public final void a(String str, @NonNull Error error) {
                Object[] objArr2 = {str, error};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d32370ce0f35961fb36fea4ee7a26ec1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d32370ce0f35961fb36fea4ee7a26ec1");
                    return;
                }
                VoicePrintSubFragment2.this.b.b();
                StringBuilder sb = new StringBuilder();
                sb.append(error.message);
                sb.append(x.a((int) R.string.yoda_voice_verify_retry_message_tail));
                VoicePrintSubFragment2.this.a(error.message);
                if (VoicePrintSubFragment2.this.b != null) {
                    VoicePrintSubFragment2.this.b.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 703);
                    VoicePrintSubFragment2.this.b.d("yoda_voice_verify_page_launch", "voice_fragment2");
                }
            }
        });
    }

    @Override // com.meituan.android.yoda.widget.view.VoicePrintView.b
    public final void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ab3709431f64c94cd7f2cf9b0676eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ab3709431f64c94cd7f2cf9b0676eb");
        } else if (file != null) {
            try {
                this.b.a();
                this.b.a(file, "");
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bcf01247834aaa5a6cbb52574dd14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bcf01247834aaa5a6cbb52574dd14c");
        } else if (i == 0) {
            int language = this.k.setLanguage(Locale.CHINA);
            if (language == -1 || language == -2) {
                this.l = false;
                this.k = null;
            }
            if (this.k != null) {
                this.k.setPitch(2.5f);
                this.k.setSpeechRate(2.0f);
                this.l = true;
            }
        }
    }

    public static /* synthetic */ void a(VoicePrintSubFragment2 voicePrintSubFragment2, Error error) {
        Object[] objArr = {voicePrintSubFragment2, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46bd2401d4aa0ebc3e2dd2c036cfc065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46bd2401d4aa0ebc3e2dd2c036cfc065");
        } else if (voicePrintSubFragment2.b.c()) {
        } else {
            YodaResult yodaResult = new YodaResult();
            yodaResult.status = 1;
            yodaResult.data = new HashMap();
            yodaResult.data.put("action", voicePrintSubFragment2.b.getAction());
            com.meituan.android.yoda.data.a aVar = new com.meituan.android.yoda.data.a();
            aVar.c = yodaResult;
            b.a(error.requestCode, aVar);
            com.meituan.android.yoda.action.a.a(71).a(com.meituan.android.yoda.config.launch.b.a().a(), voicePrintSubFragment2.b.getRequestCode(), error.requestCode, voicePrintSubFragment2.getActivity(), -1, voicePrintSubFragment2.b.g, voicePrintSubFragment2.b.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0101d7fa2413d566a65c4622313fc676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0101d7fa2413d566a65c4622313fc676");
        } else if (this.g == null) {
        } else {
            this.g.setAccessibilityDelegate(new a(str));
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292319d4eb247b09bc87c27cf8657e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292319d4eb247b09bc87c27cf8657e48");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            x.a(getActivity(), str);
        }
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4653eaf8017e90a118db309508b91cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4653eaf8017e90a118db309508b91cd");
            return;
        }
        synchronized (this.k) {
            this.m.append(str);
        }
        this.c.removeCallbacks(this.q);
        this.c.postDelayed(this.q, 800L);
    }
}
