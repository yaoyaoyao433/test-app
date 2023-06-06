package com.meituan.android.yoda.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.IOUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.bean.AESKeys;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.config.verify.a;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1;
import com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2;
import com.meituan.android.yoda.fragment.face.p;
import com.meituan.android.yoda.fragment.face.q;
import com.meituan.android.yoda.fragment.face.r;
import com.meituan.android.yoda.fragment.face.s;
import com.meituan.android.yoda.fragment.face.u;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.FaceDetUtils;
import com.meituan.android.yoda.util.OpenDetailPageUtil;
import com.meituan.android.yoda.util.aa;
import com.meituan.android.yoda.util.j;
import com.meituan.android.yoda.util.l;
import com.meituan.android.yoda.util.t;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.android.yoda.widget.view.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FaceDetectionFragment extends BaseFragment implements com.meituan.android.yoda.interfaces.b {
    public static ChangeQuickRedirect o;
    public j p;
    public boolean q;
    private com.meituan.android.yoda.callbacks.c r;
    private Toolbar s;
    private com.meituan.android.privacy.interfaces.d t;

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(Error error) {
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

    public FaceDetectionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42fc0ca6c34e795adb099b5d74393d0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42fc0ca6c34e795adb099b5d74393d0a");
            return;
        }
        this.q = true;
        this.t = new com.meituan.android.privacy.interfaces.d() { // from class: com.meituan.android.yoda.fragment.FaceDetectionFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.d
            public final void onResult(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f23ebfddd60aeaa15c91b1b615bd2635", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f23ebfddd60aeaa15c91b1b615bd2635");
                } else if (i <= 0) {
                    final com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(FaceDetectionFragment.this.d);
                    final Error error = new Error(1211111);
                    error.message = "需要相机权限";
                    if (Privacy.createPermissionGuard().a(FaceDetectionFragment.this.getContext(), PermissionGuard.PERMISSION_CAMERA, "jcyf-3e2361e8b87eaf2d") == -7) {
                        try {
                            OpenDetailPageUtil.a(new WeakReference(FaceDetectionFragment.this.getActivity()), x.a((int) R.string.yoda_face_verify_permission_request_title), x.a((int) R.string.yoda_face_verify_permission_request_message), x.a((int) R.string.yoda_face_verify_permission_request_positive_text), x.a((int) R.string.yoda_face_verify_permission_request_negative_text), new WeakReference(new OpenDetailPageUtil.DetailDialogCallback() { // from class: com.meituan.android.yoda.fragment.FaceDetectionFragment.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void positivecallback() {
                                }

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void negativecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49f14fca8d85d9af97abba0f15111111", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49f14fca8d85d9af97abba0f15111111");
                                    } else if (a2 != null) {
                                        if (a2.f != null && a2.f.a() > 1) {
                                            x.a(FaceDetectionFragment.this.getActivity(), error.message);
                                        } else if (FaceDetectionFragment.this.g != null) {
                                            FaceDetectionFragment.this.g.onError(FaceDetectionFragment.this.d, error);
                                        }
                                    }
                                }
                            }));
                        } catch (Exception unused) {
                            x.a(FaceDetectionFragment.this.getActivity(), FaceDetectionFragment.this.getActivity().getString(R.string.yoda_face_verify_permission_request_message));
                        }
                    } else {
                        try {
                            OpenDetailPageUtil.a(new WeakReference(FaceDetectionFragment.this.getActivity()), x.a((int) R.string.yoda_face_verify_permission_request_title), x.a((int) R.string.yoda_face_verify_permission_request_message), x.a((int) R.string.yoda_face_verify_permission_request_positive_text), x.a((int) R.string.yoda_face_verify_permission_request_negative_text), new WeakReference(new OpenDetailPageUtil.DetailDialogCallback() { // from class: com.meituan.android.yoda.fragment.FaceDetectionFragment.1.2
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void positivecallback() {
                                }

                                @Override // com.meituan.android.yoda.util.OpenDetailPageUtil.DetailDialogCallback
                                public final void negativecallback() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b10277dafd9f69a1943c0b453c16ed78", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b10277dafd9f69a1943c0b453c16ed78");
                                    } else if (a2 != null) {
                                        if (a2.f != null && a2.f.a() > 1) {
                                            x.a(FaceDetectionFragment.this.getActivity(), error.message);
                                        } else if (FaceDetectionFragment.this.g != null) {
                                            FaceDetectionFragment.this.g.onError(FaceDetectionFragment.this.d, error);
                                        }
                                    }
                                }
                            }));
                        } catch (Exception unused2) {
                            x.a(FaceDetectionFragment.this.getActivity(), FaceDetectionFragment.this.getActivity().getString(R.string.yoda_face_verify_permission_request_message));
                        }
                    }
                    FaceDetectionFragment.this.a("yoda_face_verify_launch_status", "face_fragment2", true, 708);
                    FaceDetectionFragment.this.d("yoda_face_verify_launch_status", "face_fragment2");
                } else {
                    FaceDetectionFragment.this.c("yoda_face_verify_page_launch", "face_fragment2");
                    FaceDetectionFragment.this.p.a(FaceDetectionSubFragment2.a(FaceDetectionFragment.this.d, FaceDetectionFragment.this.e, String.valueOf(FaceDetectionFragment.this.l)), "face_fragment2");
                }
            }
        };
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f12b9c8a4bf14c9d66ebda1b68b1dadc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f12b9c8a4bf14c9d66ebda1b68b1dadc");
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onCreateView, requestCode = " + this.d, true);
        View inflate = layoutInflater.inflate(R.layout.yoda_fragment_voiceprint, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ac24e23d78746da1935b7c30f70dc5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ac24e23d78746da1935b7c30f70dc5c");
        } else {
            this.s = (Toolbar) inflate.findViewById(R.id.yoda_statusBar_toolbar);
            this.s.setNavigationIcon(new com.meituan.android.yoda.widget.drawable.a().a(com.meituan.android.yoda.config.ui.d.a().g()).a(20.0f));
            this.s.setNavigationOnClickListener(e.a(this));
            this.p = new j(getChildFragmentManager(), R.id.container);
            l();
            getActivity().getWindow().setFormat(-3);
        }
        return inflate;
    }

    public static /* synthetic */ void a(FaceDetectionFragment faceDetectionFragment, View view) {
        Object[] objArr = {faceDetectionFragment, view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "442a8afc9141d4361b0781336aea073b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "442a8afc9141d4361b0781336aea073b");
        } else {
            faceDetectionFragment.getActivity().finish();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final View a(@NonNull View view, int i, String str, com.meituan.android.yoda.interfaces.e eVar) {
        Object[] objArr = {view, Integer.valueOf(i), str, eVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6edad3372e387bf896d9c0f7d64b3a4d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6edad3372e387bf896d9c0f7d64b3a4d") : super.a(view, i, str, eVar);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464d530b27520e24c66bac3f2b5e6466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464d530b27520e24c66bac3f2b5e6466");
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606f8f7498e5ae7aa3d40419a248bba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606f8f7498e5ae7aa3d40419a248bba9");
            return;
        }
        super.onAttach(context);
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onAttach, requestCode = " + this.d, true);
        if (context instanceof com.meituan.android.yoda.callbacks.c) {
            this.r = (com.meituan.android.yoda.callbacks.c) context;
            this.r.a(this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56dfe2839c2d9e658b836830678787ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56dfe2839c2d9e658b836830678787ff");
            return;
        }
        super.onDetach();
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDetach, requestCode = " + this.d, true);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e71d2fdd4173115b0c91b7b9349ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e71d2fdd4173115b0c91b7b9349ffa");
        } else {
            super.a(hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd706856160e5d7272d2c8c57a99030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd706856160e5d7272d2c8c57a99030");
        } else {
            super.b(hashMap, hVar);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(HashMap<String, String> hashMap, File file, String str, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, file, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e3c44c40167e12dca463b61c71087b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e3c44c40167e12dca463b61c71087b");
        } else {
            super.a(hashMap, file, str, hVar);
        }
    }

    public final boolean a(String str, Map<String, String> map, Map<String, String> map2, String str2, byte[] bArr, AESKeys aESKeys) throws IOException {
        Object[] objArr = {str, null, map2, str2, bArr, aESKeys};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "668d91c50a8cd4678ac41eb9b6b90140", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "668d91c50a8cd4678ac41eb9b6b90140")).booleanValue() : FaceDetUtils.post(str, null, map2, str2, bArr, aESKeys);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc7ed29f129a950791fc879af42a475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc7ed29f129a950791fc879af42a475");
            return;
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
        if (faceDetectionSubFragment2 != null) {
            Object[] objArr2 = {str, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "77f510271d13dede48552d45ecad320c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "77f510271d13dede48552d45ecad320c");
            } else {
                faceDetectionSubFragment2.a();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143cb7e6ab3ceaefe6cdc0be99394852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143cb7e6ab3ceaefe6cdc0be99394852");
            return;
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
        if (faceDetectionSubFragment2 != null) {
            Object[] objArr2 = {str, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "ebddb637919903d60b87c28d05816bf3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "ebddb637919903d60b87c28d05816bf3");
            } else {
                faceDetectionSubFragment2.a();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2405cb0a96029850d3df0fe76d72fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2405cb0a96029850d3df0fe76d72fe6");
            return;
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
        if (faceDetectionSubFragment2 != null) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "87c7ca9998ef5bf2cdf359b54fe2fe0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "87c7ca9998ef5bf2cdf359b54fe2fe0f");
            } else {
                faceDetectionSubFragment2.a();
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d16bd2ac66408478ca8813d251eb419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d16bd2ac66408478ca8813d251eb419");
            return;
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
        if (faceDetectionSubFragment2 != null) {
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "13ddcf39573f38fd06a1bca47a765c58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "13ddcf39573f38fd06a1bca47a765c58");
                return;
            }
            Statistics.getChannel("techportal").writeModelView(faceDetectionSubFragment2.t, "b_usqw4ety", faceDetectionSubFragment2.r, "c_qbkemhd7");
            Statistics.getChannel("techportal").writeModelView(faceDetectionSubFragment2.t, "b_techportal_bv714qfw_mv", faceDetectionSubFragment2.c(), "c_qbkemhd7");
            if (faceDetectionSubFragment2.b != null && faceDetectionSubFragment2.b.m != null) {
                faceDetectionSubFragment2.b.m.e = a.EnumC0375a.FACE_COMPARE_SUCCESS;
            }
            faceDetectionSubFragment2.a();
            faceDetectionSubFragment2.a("核验成功");
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
        long currentTimeMillis;
        List<String> list;
        String a;
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d4ef9a135d9fe8c4afcee83883a149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d4ef9a135d9fe8c4afcee83883a149");
            return;
        }
        FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
        if (faceDetectionSubFragment2 != null) {
            Object[] objArr2 = {str, error};
            ChangeQuickRedirect changeQuickRedirect2 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "3f416036fa2dbaac00d35b49f32f44c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, faceDetectionSubFragment2, changeQuickRedirect2, false, "3f416036fa2dbaac00d35b49f32f44c1");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("FaceSubFrag2", "onVerifyError, requestCode = " + str, true);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = t.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f504d5be9329edf713f0513438b33b39", RobustBitConfig.DEFAULT_VALUE)) {
                currentTimeMillis = ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f504d5be9329edf713f0513438b33b39")).longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis() - t.b;
                t.b = System.currentTimeMillis();
            }
            HashMap hashMap = new HashMap(faceDetectionSubFragment2.r);
            HashMap hashMap2 = new HashMap(faceDetectionSubFragment2.s);
            hashMap2.put("duration", Long.valueOf(currentTimeMillis));
            hashMap2.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, faceDetectionSubFragment2.o);
            hashMap2.put("action", faceDetectionSubFragment2.p);
            hashMap2.put(IOUtils.YODA_VERSION, x.i());
            hashMap2.put("method", faceDetectionSubFragment2.q);
            hashMap.put("custom", hashMap2);
            Statistics.getChannel("techportal").writeSystemCheck(faceDetectionSubFragment2.t, "b_ht1sxyz4", hashMap, "c_qbkemhd7");
            Statistics.getChannel("techportal").writeModelView(faceDetectionSubFragment2.t, "b_techportal_ee1so071_mv", faceDetectionSubFragment2.c(), "c_qbkemhd7");
            faceDetectionSubFragment2.a();
            if (!com.meituan.android.yoda.config.a.a(error.code)) {
                list = null;
            } else if (error.icons == null || error.icons.isEmpty()) {
                list = faceDetectionSubFragment2.b();
            } else {
                list = error.icons;
            }
            if (faceDetectionSubFragment2.a(str, error)) {
                faceDetectionSubFragment2.f = true;
                if (faceDetectionSubFragment2.n != null) {
                    if (faceDetectionSubFragment2.n.a()) {
                        faceDetectionSubFragment2.n.b();
                    }
                    faceDetectionSubFragment2.n.a(faceDetectionSubFragment2.getContext(), CommonDialog.b.CONFIRM).a(error.message, 17.0f).a(8).a(x.a((int) R.string.yoda_face_verify_retry), 17, p.a(faceDetectionSubFragment2)).b(faceDetectionSubFragment2.h, 17, q.a(faceDetectionSubFragment2)).a(list).c();
                }
            } else if (!faceDetectionSubFragment2.a(str, error, true)) {
                faceDetectionSubFragment2.f = true;
                if (faceDetectionSubFragment2.n != null) {
                    if (faceDetectionSubFragment2.n.a()) {
                        faceDetectionSubFragment2.n.b();
                    }
                    error.YODErrorUserInteractionKey = 1;
                    if (faceDetectionSubFragment2.m) {
                        a = faceDetectionSubFragment2.k;
                    } else {
                        a = x.a((int) R.string.yoda_face_verify_help);
                    }
                    faceDetectionSubFragment2.n.a(faceDetectionSubFragment2.getContext(), CommonDialog.b.CONFIRM).a(error.message, 17.0f).a(8).b(a, 17, r.a(faceDetectionSubFragment2, str, error)).a(x.a((int) R.string.yoda_face_verify_retry), 17, s.a(faceDetectionSubFragment2)).a(list).c();
                }
            }
            if (error == null || com.meituan.android.yoda.config.verify.c.a() == null || !FaceDetectionSubFragment2.a(com.meituan.android.yoda.config.verify.c.a().c())) {
                return;
            }
            String str2 = error.message;
            Object[] objArr4 = {str2};
            ChangeQuickRedirect changeQuickRedirect4 = FaceDetectionSubFragment2.a;
            if (PatchProxy.isSupport(objArr4, faceDetectionSubFragment2, changeQuickRedirect4, false, "ef4930c1f278a5c6b2f5dadab026a338", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, faceDetectionSubFragment2, changeQuickRedirect4, false, "ef4930c1f278a5c6b2f5dadab026a338");
            } else if (!faceDetectionSubFragment2.v || faceDetectionSubFragment2.u == null || TextUtils.isEmpty(str2)) {
            } else {
                faceDetectionSubFragment2.u.speak(str2, 0, null, str2 + System.currentTimeMillis());
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755fed52fed69f1a901cbed8c21ec99f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755fed52fed69f1a901cbed8c21ec99f");
        } else {
            super.a();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457a592d7e28fb69cba08ec0c1104951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457a592d7e28fb69cba08ec0c1104951");
        } else {
            super.b();
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ca8a73d0968381f98b0d025333eb44d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ca8a73d0968381f98b0d025333eb44d")).booleanValue() : super.c();
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2d716fa1858fb3fc875dcfd953bc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2d716fa1858fb3fc875dcfd953bc39");
        } else if (isHidden()) {
            this.p.a(FaceDetectionSubFragment1.class.getSimpleName());
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab783a842945cadcf0b04f6f60df547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab783a842945cadcf0b04f6f60df547");
        } else {
            super.setUserVisibleHint(z);
        }
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final boolean j() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e20935747f0cf4fbc0cd9a43954028c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e20935747f0cf4fbc0cd9a43954028c")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b851f5cd3c54ad73626746497e2903ed", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b851f5cd3c54ad73626746497e2903ed")).booleanValue();
        } else {
            FaceDetectionSubFragment2 faceDetectionSubFragment2 = (FaceDetectionSubFragment2) this.p.b("face_fragment2");
            if (faceDetectionSubFragment2 != null && faceDetectionSubFragment2.isResumed()) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = FaceDetectionSubFragment2.a;
                if (PatchProxy.isSupport(objArr3, faceDetectionSubFragment2, changeQuickRedirect3, false, "3b39c4788069187e585e5b6d37349a78", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, faceDetectionSubFragment2, changeQuickRedirect3, false, "3b39c4788069187e585e5b6d37349a78")).booleanValue();
                } else if (!faceDetectionSubFragment2.y && faceDetectionSubFragment2.n != null) {
                    if (faceDetectionSubFragment2.n.a()) {
                        faceDetectionSubFragment2.n.b();
                    }
                    faceDetectionSubFragment2.n.a(faceDetectionSubFragment2.getContext(), CommonDialog.b.CONFIRM).a(x.a((int) R.string.yoda_face_stay_dialog_title), 17.0f).a(8).a(x.a((int) R.string.yoda_dialog_confirm), 17, com.meituan.android.yoda.fragment.face.t.a(faceDetectionSubFragment2)).b(x.a((int) R.string.yoda_dialog_cancel), 17, u.a(faceDetectionSubFragment2)).a((List<String>) null).c();
                    faceDetectionSubFragment2.f = true;
                    if (faceDetectionSubFragment2.c != null) {
                        faceDetectionSubFragment2.c.stopPreview();
                        com.meituan.android.yoda.widget.tool.d.a(faceDetectionSubFragment2.c.getWhich(), 4, 0L, (HashMap<String, String>) null);
                        com.meituan.android.yoda.widget.tool.d.a(faceDetectionSubFragment2.c.getActionSeq(), 4, 0L, (HashMap<String, String>) null);
                    }
                    if (faceDetectionSubFragment2.d != null && faceDetectionSubFragment2.w != null) {
                        faceDetectionSubFragment2.d.removeCallbacks(faceDetectionSubFragment2.w);
                    }
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            return true;
        }
        y.a(getActivity().getWindow(), 32);
        if (this.q) {
            return this.p.a(FaceDetectionSubFragment1.class.getSimpleName());
        }
        return false;
    }

    @Override // com.meituan.android.yoda.interfaces.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18fbd602a9b374c087a08e8d54c6aa76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18fbd602a9b374c087a08e8d54c6aa76");
            return;
        }
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments == null || fragments.isEmpty()) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (fragment != null) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final boolean a(String str, Error error, boolean z) {
        Object[] objArr = {str, error, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a783883b2138b015264d43afa1116131", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a783883b2138b015264d43afa1116131")).booleanValue() : super.a(str, error, z);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final boolean c(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eabcd8efed7a3a91ed99de395038d5e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eabcd8efed7a3a91ed99de395038d5e8")).booleanValue() : super.c(str, error);
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8469de30d46f4ac966448988f5dc1c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8469de30d46f4ac966448988f5dc1c36");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if (fragment != null) {
                        fragment.onRequestPermissionsResult(i, strArr, iArr);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void i() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a5ecf5ec3d5647f7c221cc4be523a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a5ecf5ec3d5647f7c221cc4be523a5");
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a(this.c, "jump2YodaFaceFaqPage", true);
        if (getActivity() == null) {
            return;
        }
        if (l.a()) {
            JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
            if (d != null && d.has("faceFaqActionRef")) {
                try {
                    str = d.getString("faceFaqActionRef");
                } catch (JSONException unused) {
                }
                aa.a(getActivity(), str);
                k();
                return;
            }
            str = "http://verify.meituan.com/faceHelp";
            aa.a(getActivity(), str);
            k();
            return;
        }
        com.meituan.android.yoda.plugins.c b = com.meituan.android.yoda.plugins.d.a().b();
        Bundle a = com.meituan.android.yoda.help.a.a(com.meituan.android.yoda.help.a.a(b != null ? b.getNetEnv() : 1, 108), this.d);
        SimpleWebViewFragment simpleWebViewFragment = new SimpleWebViewFragment();
        simpleWebViewFragment.setArguments(a);
        if (this.q) {
            this.p.b(simpleWebViewFragment, "yoda_faq_webview_fragment");
        } else {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.yoda_activity_rootView, simpleWebViewFragment, "yoda_faq_webview_fragment").addToBackStack(null).commit();
        }
        y.a(getActivity().getWindow(), 20);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void h(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0010f149cacd2d5c606e95af49331267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0010f149cacd2d5c606e95af49331267");
            return;
        }
        String str3 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str3, "jump2ConfigFaqPage, url = " + str, true);
        if (l.a()) {
            JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
            if (d != null && d.has("faceFaqActionRef")) {
                try {
                    str2 = d.getString("faceFaqActionRef");
                } catch (JSONException unused) {
                }
                aa.a(getActivity(), str2);
                k();
            }
            str2 = "http://verify.meituan.com/faceHelp";
            aa.a(getActivity(), str2);
            k();
        } else if (this.p != null) {
            Bundle bundle = new Bundle();
            bundle.putString("wenview_url", str);
            SimpleWebViewFragment simpleWebViewFragment = new SimpleWebViewFragment();
            simpleWebViewFragment.setArguments(bundle);
            this.p.b(simpleWebViewFragment, "config_faq_webview_fragment");
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b96cc185e0f0a2258096d082814b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b96cc185e0f0a2258096d082814b1d");
            return;
        }
        try {
            this.p.a(FaceDetectionSubFragment1.class.getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.yoda.fragment.FaceDetectionFragment.o
            java.lang.String r10 = "61446ddb7602a9697c50d28cd3237357"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            r0 = 1
            r11.q = r0
            com.meituan.android.yoda.config.ui.c r1 = com.meituan.android.yoda.config.ui.d.a()
            org.json.JSONObject r1 = r1.d()
            if (r1 == 0) goto L3d
            java.lang.String r2 = "ignoreFaceGuide"
            boolean r2 = r1.has(r2)
            if (r2 == 0) goto L3d
            java.lang.String r2 = "ignoreFaceGuide"
            boolean r1 = r1.getBoolean(r2)     // Catch: org.json.JSONException -> L39
            r1 = r1 ^ r0
            r11.q = r1     // Catch: org.json.JSONException -> L39
            goto L3f
        L39:
            r1 = move-exception
            r1.printStackTrace()
        L3d:
            r11.q = r0
        L3f:
            boolean r0 = r11.q
            if (r0 == 0) goto L59
            com.meituan.android.yoda.util.j r0 = r11.p
            java.lang.String r1 = r11.d
            java.lang.String r2 = r11.e
            int r3 = r11.l
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1 r1 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment1.a(r1, r2, r3)
            java.lang.String r2 = "face_fragment1"
            r0.a(r1, r2)
            return
        L59:
            java.lang.String r0 = "yoda_face_verify_page_launch"
            java.lang.String r1 = "face_fragment2"
            r11.c(r0, r1)
            com.meituan.android.privacy.interfaces.e r0 = com.meituan.android.privacy.interfaces.Privacy.createPermissionGuard()
            android.content.Context r1 = r11.getContext()
            java.lang.String r2 = "Camera"
            java.lang.String r3 = "jcyf-3e2361e8b87eaf2d"
            int r0 = r0.a(r1, r2, r3)
            if (r0 <= 0) goto L8a
            com.meituan.android.yoda.util.j r0 = r11.p
            java.lang.String r1 = r11.d
            java.lang.String r2 = r11.e
            int r3 = r11.l
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2 r1 = com.meituan.android.yoda.fragment.face.FaceDetectionSubFragment2.a(r1, r2, r3)
            java.lang.String r2 = "face_fragment2"
            r0.a(r1, r2)
            return
        L8a:
            com.meituan.android.privacy.interfaces.e r0 = com.meituan.android.privacy.interfaces.Privacy.createPermissionGuard()
            android.support.v4.app.FragmentActivity r1 = r11.getActivity()
            java.lang.String r2 = "Camera"
            java.lang.String r3 = "jcyf-3e2361e8b87eaf2d"
            com.meituan.android.privacy.interfaces.d r4 = r11.t
            r0.a(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.fragment.FaceDetectionFragment.l():void");
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(Button button) {
        Object[] objArr = {button};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915d5c8767e5f6c599222d145d6ed5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915d5c8767e5f6c599222d145d6ed5c5");
        } else {
            super.a(button);
        }
    }
}
