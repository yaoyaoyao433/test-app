package com.meituan.android.yoda.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.OpenDetailPageUtil;
import com.meituan.android.yoda.util.j;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class VoicePrintVerifyFragment extends BaseFragment implements com.meituan.android.yoda.interfaces.b {
    public static ChangeQuickRedirect o;
    public j p;
    private Toolbar q;
    private com.meituan.android.yoda.callbacks.c r;
    private final int s;
    private com.meituan.android.privacy.interfaces.g t;

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        return null;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        return 0;
    }

    @Override // android.support.v4.app.Fragment
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d96c37b4525b0fbcc37d8fc827b7662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d96c37b4525b0fbcc37d8fc827b7662");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
        }
    }

    public VoicePrintVerifyFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa9a16432b23733b3908c96eb441288f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa9a16432b23733b3908c96eb441288f");
            return;
        }
        this.s = 100;
        this.t = new com.meituan.android.privacy.interfaces.g() { // from class: com.meituan.android.yoda.fragment.VoicePrintVerifyFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4519b6d6a09c749885f49c507d392649", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4519b6d6a09c749885f49c507d392649");
                } else if (i <= 0) {
                    if (Privacy.createPermissionGuard().a(VoicePrintVerifyFragment.this.getContext(), PermissionGuard.PERMISSION_MICROPHONE, "jcyf-0268d593bb3f5183") == -7) {
                        try {
                            OpenDetailPageUtil.a(VoicePrintVerifyFragment.this.getActivity(), x.a((int) R.string.yoda_face_verify_permission_request_title), x.a((int) R.string.yoda_voice_verify_permission_request_message), x.a((int) R.string.yoda_face_verify_permission_request_positive_text), x.a((int) R.string.yoda_face_verify_permission_request_negative_text));
                        } catch (Exception unused) {
                            x.a(VoicePrintVerifyFragment.this.getActivity(), VoicePrintVerifyFragment.this.getActivity().getString(R.string.yoda_voice_verify_permission_request_message));
                        }
                    } else {
                        try {
                            OpenDetailPageUtil.a(VoicePrintVerifyFragment.this.getActivity(), x.a((int) R.string.yoda_face_verify_permission_request_title), x.a((int) R.string.yoda_voice_verify_permission_request_message), x.a((int) R.string.yoda_face_verify_permission_request_positive_text), x.a((int) R.string.yoda_face_verify_permission_request_negative_text));
                        } catch (Exception unused2) {
                            x.a(VoicePrintVerifyFragment.this.getActivity(), VoicePrintVerifyFragment.this.getActivity().getString(R.string.yoda_voice_verify_permission_request_message));
                        }
                    }
                    VoicePrintVerifyFragment.this.a("yoda_voice_verify_page_launch", "voice_fragment2", true, 708);
                    VoicePrintVerifyFragment.this.d("yoda_voice_verify_page_launch", "voice_fragment2");
                } else {
                    VoicePrintVerifyFragment.this.p.a(new VoicePrintSubFragment2(), "voice_fragment2");
                }
            }
        };
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec4db68faaf523b84a706495c7ad1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec4db68faaf523b84a706495c7ad1b4");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae7461e63f34a28eb4e1e390cd225a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae7461e63f34a28eb4e1e390cd225a1");
        }
        c("yoda_voice_verify_page_launch", "voice_fragment2");
        View inflate = layoutInflater.inflate(R.layout.yoda_fragment_voiceprint, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8afdfc652f3950bd7e854b891f49226f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8afdfc652f3950bd7e854b891f49226f");
        } else {
            this.q = (Toolbar) inflate.findViewById(R.id.yoda_statusBar_toolbar);
            this.q.setNavigationIcon(new com.meituan.android.yoda.widget.drawable.a().a(com.meituan.android.yoda.config.ui.d.a().g()).a(20.0f));
            this.q.setNavigationOnClickListener(i.a(this));
            this.p = new j(getChildFragmentManager(), R.id.container);
            com.meituan.android.yoda.data.a a = com.meituan.android.yoda.data.b.a(this.d);
            if (a != null && a.c != null && a.c.data != null) {
                Map<String, Object> map = a.c.data;
                if (map.containsKey("tips")) {
                    map.get("tips");
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d59fcf7c32e37366e01d05e1d93f805", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d59fcf7c32e37366e01d05e1d93f805");
            } else if (Privacy.createPermissionGuard().a(getContext(), PermissionGuard.PERMISSION_MICROPHONE, "jcyf-0268d593bb3f5183") > 0) {
                this.p.a(new VoicePrintSubFragment2(), "voice_fragment2");
            } else {
                com.meituan.android.yoda.monitor.log.a.a(this.c, "requestPermissionsAndShowPage, need requestPermission PERMISSION_MICROPHONE.", false);
                Privacy.createPermissionGuard().a((Activity) getActivity(), PermissionGuard.PERMISSION_MICROPHONE, "jcyf-0268d593bb3f5183", (com.meituan.android.privacy.interfaces.d) this.t);
            }
        }
        return inflate;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabe35dfe335732063757f11d0cb8913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabe35dfe335732063757f11d0cb8913");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final View a(@NonNull View view, int i, String str, com.meituan.android.yoda.interfaces.e eVar) {
        Object[] objArr = {view, Integer.valueOf(i), str, eVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7cf4f659861f9c2b99e112544258ac", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7cf4f659861f9c2b99e112544258ac") : super.a(view, i, str, eVar);
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02309c58a931bfdae7a19b33aa3944b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02309c58a931bfdae7a19b33aa3944b");
            return;
        }
        super.onAttach(context);
        if (context instanceof com.meituan.android.yoda.callbacks.c) {
            this.r = (com.meituan.android.yoda.callbacks.c) context;
            this.r.a(this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f24e7602b757f6088ad4c80d092b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f24e7602b757f6088ad4c80d092b0a");
        } else {
            super.onDetach();
        }
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d6f431f794dc8605b49b5883b7db39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d6f431f794dc8605b49b5883b7db39")).booleanValue();
        }
        j jVar = this.p;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "e0e77792d399e6011ecf1464e65a9036", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "e0e77792d399e6011ecf1464e65a9036")).booleanValue();
        }
        if (jVar.b == null || jVar.b.getBackStackEntryCount() <= 1) {
            return false;
        }
        jVar.b.popBackStack();
        return true;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2915d42af76f3414db8b445cb367ecca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2915d42af76f3414db8b445cb367ecca");
            return;
        }
        VoicePrintSubFragment2 voicePrintSubFragment2 = (VoicePrintSubFragment2) this.p.b("voice_fragment2");
        if (voicePrintSubFragment2 != null) {
            Object[] objArr2 = {str, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect2 = VoicePrintSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "633540b4d406f9b8123942c55a04725a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "633540b4d406f9b8123942c55a04725a");
            } else {
                voicePrintSubFragment2.b.b();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9e7afe6ff9b8b4b4b0817fc89fc20b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9e7afe6ff9b8b4b4b0817fc89fc20b");
            return;
        }
        VoicePrintSubFragment2 voicePrintSubFragment2 = (VoicePrintSubFragment2) this.p.b("voice_fragment2");
        if (voicePrintSubFragment2 != null) {
            Object[] objArr2 = {str, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect2 = VoicePrintSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "899d9a34c56020d1e2114b24ea5de485", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "899d9a34c56020d1e2114b24ea5de485");
            } else {
                voicePrintSubFragment2.b.b();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4016b204492806ca03756df3d43c49e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4016b204492806ca03756df3d43c49e8");
        } else {
            this.p.b("voice_fragment2");
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451e0beeb695a27893f96c84a3d8b26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451e0beeb695a27893f96c84a3d8b26e");
            return;
        }
        VoicePrintSubFragment2 voicePrintSubFragment2 = (VoicePrintSubFragment2) this.p.b("voice_fragment2");
        if (voicePrintSubFragment2 != null) {
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = VoicePrintSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "13a6f82afd74763a713c4eb5bdd2aca0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "13a6f82afd74763a713c4eb5bdd2aca0");
                return;
            }
            voicePrintSubFragment2.b.b();
            if (voicePrintSubFragment2.b.k) {
                voicePrintSubFragment2.b(x.a((int) R.string.yoda_voice_verify_success_quit_message));
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79d12be87ed6fad0e87258be1c0b888c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79d12be87ed6fad0e87258be1c0b888c");
            return;
        }
        final VoicePrintSubFragment2 voicePrintSubFragment2 = (VoicePrintSubFragment2) this.p.b("voice_fragment2");
        if (voicePrintSubFragment2 != null) {
            Object[] objArr2 = {str, error};
            ChangeQuickRedirect changeQuickRedirect2 = VoicePrintSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "901310db11c72ce836fd8cee77b67a81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, voicePrintSubFragment2, changeQuickRedirect2, false, "901310db11c72ce836fd8cee77b67a81");
                return;
            }
            voicePrintSubFragment2.b.b();
            if (!voicePrintSubFragment2.b.c(str, error)) {
                if (com.meituan.android.yoda.config.a.c(error.code)) {
                    if (voicePrintSubFragment2.b.g != null) {
                        voicePrintSubFragment2.b.g.onError(str, error);
                    }
                    if (voicePrintSubFragment2.b.k) {
                        voicePrintSubFragment2.b(x.a((int) R.string.yoda_voice_verify_fail_quit_message));
                    }
                } else if (error.requestCode != null) {
                    new Handler().postDelayed(com.meituan.android.yoda.fragment.voiceprint.a.a(voicePrintSubFragment2, error), 300L);
                } else {
                    voicePrintSubFragment2.a(error.message);
                }
            } else if (voicePrintSubFragment2.b.k) {
                voicePrintSubFragment2.c.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.fragment.voiceprint.VoicePrintSubFragment2.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bdf1f9080f42246b3f624fe04639a72d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bdf1f9080f42246b3f624fe04639a72d");
                        } else {
                            voicePrintSubFragment2.e();
                        }
                    }
                }, 6000L);
            } else {
                voicePrintSubFragment2.e();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c8423deca836a74e94f862f37143f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c8423deca836a74e94f862f37143f6");
            return;
        }
        String a = com.meituan.android.yoda.xxtea.c.a(this.d + getConfirmType());
        String a2 = com.meituan.android.yoda.xxtea.f.a(com.meituan.android.yoda.xxtea.b.a((this.d + getConfirmType() + a).getBytes()), a);
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("qe", a2);
        super.a(hashMap2, hVar);
    }

    public final void a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503c7179f2d67bb2e7ca8f793e018e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503c7179f2d67bb2e7ca8f793e018e6d");
            return;
        }
        a();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String a = com.meituan.android.yoda.xxtea.c.a(this.d + getConfirmType());
            FileInputStream fileInputStream = new FileInputStream(file);
            new StringBuilder();
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            String a2 = com.meituan.android.yoda.xxtea.c.a(bArr);
            hashMap.put("qe", com.meituan.android.yoda.xxtea.f.a(com.meituan.android.yoda.xxtea.b.a((this.d + getConfirmType() + a2).getBytes()), a));
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(hashMap, file, "audio/wav", this.j);
    }

    public static /* synthetic */ void a(VoicePrintVerifyFragment voicePrintVerifyFragment, View view) {
        Object[] objArr = {voicePrintVerifyFragment, view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17b914316815f9df41a5543b33774bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17b914316815f9df41a5543b33774bb0");
        } else {
            voicePrintVerifyFragment.getActivity().finish();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(Button button) {
        Object[] objArr = {button};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dbec9a868989c2e6d93fb900b1c5dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dbec9a868989c2e6d93fb900b1c5dd");
        } else if (button == null) {
        } else {
            super.a(button);
            Object[] objArr2 = {button, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = BaseFragment.a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6c9ea2edf8aa517373dfa2e7051b121", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6c9ea2edf8aa517373dfa2e7051b121");
            } else if (button != null) {
                button.setEnabled(true);
                if (com.meituan.android.yoda.config.ui.d.a().s()) {
                    x.b(com.meituan.android.yoda.config.ui.d.a().q(), 3);
                    button.setTextColor(x.b(com.meituan.android.yoda.config.ui.d.a().q(), 2));
                } else {
                    button.setTextColor(x.b((int) R.color.yoda_button_enabled));
                }
            }
            if (com.meituan.android.yoda.config.ui.d.a().s()) {
                Drawable a = com.meituan.android.yoda.util.i.a(com.meituan.android.yoda.util.i.a(x.c((int) R.drawable.yoda_voice_verify_mic_icon)), x.b(com.meituan.android.yoda.config.ui.d.a().q(), 1));
                a.setBounds(0, 0, a.getMinimumWidth(), a.getMinimumHeight());
                button.setCompoundDrawables(a, null, null, null);
            }
        }
    }

    public final void a(Button button, int i) {
        Object[] objArr = {button, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84a635153038fac6961793095f0d6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84a635153038fac6961793095f0d6cb");
        } else if (button != null && com.meituan.android.yoda.config.ui.d.a().r()) {
            try {
                int b = x.b(com.meituan.android.yoda.config.ui.d.a().p(), i);
                if (b != -1) {
                    button.setBackgroundColor(b);
                }
            } catch (Exception e) {
                String str = this.c;
                com.meituan.android.yoda.monitor.log.a.a(str, "setBusinessUIVerifyBtn exception " + e.getMessage(), true);
            }
        }
    }
}
