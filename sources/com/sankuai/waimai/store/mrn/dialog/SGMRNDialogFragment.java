package com.sankuai.waimai.store.mrn.dialog;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.WhiteLoadingRNFragment;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.mrn.dialog.a;
import com.sankuai.waimai.store.mrn.dialog.model.DialogActionResult;
import com.sankuai.waimai.store.mrn.dialog.model.DialogConfigResult;
import com.sankuai.waimai.store.mrn.dialog.model.MRNMessageResult;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.ui.common.SGBaseDialogFragment;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNDialogFragment extends SGBaseDialogFragment implements com.sankuai.waimai.store.mrn.dialog.base.b, d {
    public static ChangeQuickRedirect a;
    Map<String, com.sankuai.waimai.store.mrn.dialog.base.a> b;
    private WhiteLoadingRNFragment d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private boolean n;
    private Bundle o;
    private IntentFilter p;
    private b q;
    private Runnable r;
    private boolean s;
    private boolean t;
    private boolean u;
    private MRNEventHandler v;

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc31f19a6e9faaec9d4f112459dd342", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc31f19a6e9faaec9d4f112459dd342")).booleanValue() : i == 48 || i == 17 || i == 80 || i == 3 || i == 5;
    }

    public SGMRNDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2396e0c22a4aaf7fbb47e606f398e6e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2396e0c22a4aaf7fbb47e606f398e6e1");
            return;
        }
        this.e = false;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 1200;
        this.j = -1;
        this.k = 80;
        this.l = -1.0f;
        this.s = false;
        this.t = false;
        this.u = false;
    }

    @Override // com.sankuai.waimai.store.mrn.dialog.base.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef464659e8fedca3573e0cc62d8e77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef464659e8fedca3573e0cc62d8e77a");
        } else if (this.b == null || t.a(str) || t.a(str2)) {
        } else {
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b8acd15262b4bafd563c1708875f5a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b8acd15262b4bafd563c1708875f5a0");
            } else {
                try {
                    if ("dialog_result_call_back".equals(str)) {
                        DialogActionResult dialogActionResult = (DialogActionResult) i.a(str2, DialogActionResult.class);
                        if (dialogActionResult != null && dialogActionResult.isCloseDialog && (TextUtils.isEmpty(dialogActionResult.component) || TextUtils.isEmpty(dialogActionResult.entry) || (dialogActionResult.component.equals(this.h) && dialogActionResult.entry.equals(this.g)))) {
                            this.t = true;
                            dismissAllowingStateLoss();
                        }
                    } else if ("dialog_config".equals(str)) {
                        DialogConfigResult dialogConfigResult = (DialogConfigResult) i.a(str2, DialogConfigResult.class);
                        Object[] objArr3 = {dialogConfigResult};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4fdb405044a373e680b5421593e4087", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4fdb405044a373e680b5421593e4087");
                        } else if (dialogConfigResult != null && (TextUtils.isEmpty(dialogConfigResult.component) || TextUtils.isEmpty(dialogConfigResult.entry) || (dialogConfigResult.component.equals(this.h) && dialogConfigResult.entry.equals(this.g)))) {
                            if (dialogConfigResult.dialogWidth > 0.0f) {
                                this.j = h.a(com.sankuai.waimai.store.util.b.a(), dialogConfigResult.dialogWidth);
                            }
                            if (dialogConfigResult.dialogHeight > 0.0f) {
                                this.i = h.a(com.sankuai.waimai.store.util.b.a(), dialogConfigResult.dialogHeight);
                            }
                            int a2 = a(dialogConfigResult.dialogPosition);
                            if (a(a2)) {
                                this.k = a2;
                            }
                            setCancelable(dialogConfigResult.closeWhenTouchMask);
                            if (getDialog() != null && getDialog().getWindow() != null && getDialog().getWindow().getAttributes() != null) {
                                a();
                            }
                        }
                    } else if ("dialog_gesture_close_on".equals(str)) {
                        this.n = true;
                    } else if ("dialog_gesture_close_off".equals(str)) {
                        this.n = false;
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
            com.sankuai.waimai.store.mrn.dialog.base.a aVar = this.b.get(str);
            if (aVar != null) {
                Object[] objArr4 = {str2, this};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.mrn.dialog.base.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "eb308af73fc5b0a8d6a5035eba906f0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "eb308af73fc5b0a8d6a5035eba906f0c");
                    return;
                }
                try {
                    i.a(str2, ((ParameterizedType) aVar.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
                } catch (Exception e2) {
                    com.sankuai.waimai.store.base.log.a.a(e2);
                }
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9d112c0ab370920d153176f3a3d1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9d112c0ab370920d153176f3a3d1b3");
            return;
        }
        super.onDismiss(dialogInterface);
        Activity d = d();
        if (this.e && (d instanceof BaseMemberActivity)) {
            if (this.t) {
                d.setResult(-1);
            }
            d.finish();
            d.overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb37544dfab2a4b8b4ff51f7378d960", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb37544dfab2a4b8b4ff51f7378d960")).intValue();
        }
        if ("top".equals(str)) {
            return 48;
        }
        return (!"center".equals(str) && "bottom".equals(str)) ? 80 : 17;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.store.mrn.dialog.base.b b;

        public b(com.sankuai.waimai.store.mrn.dialog.base.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f668c9daa890c19e9f02f9630ff76163", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f668c9daa890c19e9f02f9630ff76163");
            } else {
                this.b = bVar;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6de2bfc56002b6cff60cc68ff19e234", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6de2bfc56002b6cff60cc68ff19e234");
            } else if (intent == null || intent.getExtras() == null || this.b == null || !"sm_mrn_dialog_container_action".equals(intent.getAction())) {
            } else {
                String obj = intent.getExtras().get("data").toString();
                if (t.a(obj)) {
                    return;
                }
                try {
                    MRNMessageResult mRNMessageResult = (MRNMessageResult) i.a(obj, MRNMessageResult.class);
                    if (mRNMessageResult != null && !t.a(mRNMessageResult.messageType)) {
                        this.b.a(mRNMessageResult.messageType, i.a(mRNMessageResult.messageData));
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfdc52dbf312e394c5487f1af910718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfdc52dbf312e394c5487f1af910718");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        if (this.u && this.d != null) {
            this.d.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312921f607b81a3f28c089b305ab0411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312921f607b81a3f28c089b305ab0411");
            return;
        }
        super.onDestroy();
        if (this.v != null) {
            MRNEventHandler mRNEventHandler = this.v;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MRNEventHandler.a;
            if (PatchProxy.isSupport(objArr2, mRNEventHandler, changeQuickRedirect2, false, "4f8354e746a71dae94d6b2a4ea2d7e12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mRNEventHandler, changeQuickRedirect2, false, "4f8354e746a71dae94d6b2a4ea2d7e12");
            } else {
                com.meituan.android.bus.a.a().b(mRNEventHandler);
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0726bd9a626a24ca612641b0027aa933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0726bd9a626a24ca612641b0027aa933");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e491e7d00d13d7995a693f94f0a4e8e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e491e7d00d13d7995a693f94f0a4e8e4");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "89db9b2357871ce4d9c7ea4def88a7e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "89db9b2357871ce4d9c7ea4def88a7e7");
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f = arguments.getString("mrn_biz");
                this.g = arguments.getString("mrn_entry");
                this.h = arguments.getString("mrn_component");
                this.e = arguments.getBoolean("bundle_key_scheme_jump");
                this.l = arguments.getFloat("dim", -1.0f);
                this.u = arguments.getBoolean("need_activity_result");
                this.o = arguments.getBundle("key_mrn_param");
                this.m = "1".equals(this.o.getString("gesture_close"));
                float f = arguments.getFloat("page_height");
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f4bc19c83e2d0f7cab2284f4f0b3e582", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f4bc19c83e2d0f7cab2284f4f0b3e582");
                } else if (f > 1.0f) {
                    this.i = h.a(com.sankuai.waimai.store.util.b.a(), f);
                } else if (f > 0.0f) {
                    this.i = (int) (h.b(com.sankuai.waimai.store.util.b.a()) * f);
                }
                if (this.o != null) {
                    String string = this.o.getString("position");
                    if (!TextUtils.isEmpty(string)) {
                        int a2 = a(string);
                        if (a(a2)) {
                            this.k = a2;
                        }
                    }
                }
            }
        }
        this.q = new b(this);
        this.p = new IntentFilter("sm_mrn_dialog_container_action");
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd615deb3c5a360bd5d9193495ec1e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd615deb3c5a360bd5d9193495ec1e8");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_mrn_common_dialog, viewGroup, false);
        if (this.k == 48 && getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setWindowAnimations(R.style.DialogTopInTopOutCommonAnimation);
        }
        if (this.m) {
            Object[] objArr2 = {inflate};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6b00821126be316e7c6ba6a78c80e55", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6b00821126be316e7c6ba6a78c80e55") : com.sankuai.waimai.store.mrn.dialog.a.a(getContext(), inflate, new a.InterfaceC1233a() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c542c3c04e4172ee49c66c13e36a4d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c542c3c04e4172ee49c66c13e36a4d5");
                    } else if (i == 0) {
                        SGMRNDialogFragment.this.dismiss();
                    }
                }

                @Override // com.sankuai.waimai.store.mrn.dialog.a.InterfaceC1233a
                public final boolean a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0206d08297c6eb2d5df668e06fb48cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0206d08297c6eb2d5df668e06fb48cc")).booleanValue() : SGMRNDialogFragment.this.n;
                }
            });
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2927b21030171a45ff45b4f9d6af546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2927b21030171a45ff45b4f9d6af546");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3d4493bd530cf4ff8d38fe4df359b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3d4493bd530cf4ff8d38fe4df359b02");
            return;
        }
        if (this.d == null) {
            this.d = WhiteLoadingRNFragment.a(this.f, this.g, this.h);
            this.d.a(this.o);
            this.d.b = new Runnable() { // from class: com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dbcccf30cc12458fccfb7ad9c70575b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dbcccf30cc12458fccfb7ad9c70575b9");
                        return;
                    }
                    SGMRNDialogFragment.this.dismissAllowingStateLoss();
                    if (SGMRNDialogFragment.this.r != null) {
                        SGMRNDialogFragment.this.r.run();
                    }
                }
            };
            this.v = new MRNEventHandler(this.d);
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (this.k == 80) {
            beginTransaction.setCustomAnimations(R.anim.wm_sc_base_dialog_bottom_in, R.anim.wm_sc_base_dialog_bottom_out);
        }
        beginTransaction.add(R.id.mrn_dialog_fragment_container, this.d).commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff47501870e270995930ce2c4c344bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff47501870e270995930ce2c4c344bd");
            return;
        }
        super.onResume();
        if (!this.s) {
            a();
            this.s = true;
        }
        getActivity().registerReceiver(this.q, this.p);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3cd11de62a4ee3f3c49f2f2b6f262a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3cd11de62a4ee3f3c49f2f2b6f262a");
            return;
        }
        super.onPause();
        getActivity().unregisterReceiver(this.q);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c7621dd27152f521d7f8ad002a6e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c7621dd27152f521d7f8ad002a6e41");
        } else if (getDialog() == null || getDialog().getWindow() == null || getDialog().getWindow().getAttributes() == null) {
        } else {
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.width = this.j;
            attributes.height = this.i;
            attributes.gravity = this.k;
            if (this.l > -1.0f) {
                attributes.dimAmount = this.l;
            }
            getDialog().getWindow().setAttributes(attributes);
        }
    }

    @Override // com.sankuai.waimai.store.mrn.dialog.d
    public final void a(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d25a4d807438f6b570cae19a793d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d25a4d807438f6b570cae19a793d7f");
        } else {
            b(fragmentActivity, str);
        }
    }

    @Override // com.sankuai.waimai.store.mrn.dialog.d
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6bf417b2f8fc2bbd6a6544194ab962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6bf417b2f8fc2bbd6a6544194ab962");
        } else {
            am.a(getDialog(), str, getActivity());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.store.mrn.dialog.b {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public float e;
        public float f;
        boolean g;
        boolean h;
        public Runnable i;
        private Bundle j;
        private Map<String, com.sankuai.waimai.store.mrn.dialog.base.a> k;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9d0f4ab69f336b871b48163dcf8ec2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9d0f4ab69f336b871b48163dcf8ec2");
                return;
            }
            this.b = "supermarket";
            this.c = "";
            this.d = "";
            this.f = -1.0f;
            this.h = false;
            this.j = new Bundle();
            this.k = new HashMap();
        }

        @Override // com.sankuai.waimai.store.mrn.dialog.b
        /* renamed from: b */
        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d42106dca35949aedbda9ca70944b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d42106dca35949aedbda9ca70944b4");
            }
            this.j.putString(str, str2);
            return this;
        }

        @Override // com.sankuai.waimai.store.mrn.dialog.b
        /* renamed from: b */
        public final SGMRNDialogFragment a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5a0f8a77ed30974de17ab05c4ed885", RobustBitConfig.DEFAULT_VALUE)) {
                return (SGMRNDialogFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5a0f8a77ed30974de17ab05c4ed885");
            }
            SGMRNDialogFragment sGMRNDialogFragment = new SGMRNDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("mrn_biz", this.b);
            bundle.putString("mrn_entry", this.c);
            bundle.putString("mrn_component", this.d);
            bundle.putFloat("page_height", this.e);
            bundle.putFloat("dim", this.f);
            bundle.putBoolean("need_activity_result", this.g);
            bundle.putBoolean("bundle_key_scheme_jump", this.h);
            bundle.putBundle("key_mrn_param", this.j);
            sGMRNDialogFragment.setArguments(bundle);
            sGMRNDialogFragment.b = this.k;
            sGMRNDialogFragment.r = this.i;
            sGMRNDialogFragment.setStyle(2, R.style.RetailCommonMRNDialog);
            return sGMRNDialogFragment;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MRNEventHandler {
        public static ChangeQuickRedirect a;
        public WhiteLoadingRNFragment b;

        public MRNEventHandler(WhiteLoadingRNFragment whiteLoadingRNFragment) {
            Object[] objArr = {whiteLoadingRNFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9a1f79b697366e3f3efc112ad87faa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9a1f79b697366e3f3efc112ad87faa");
                return;
            }
            this.b = whiteLoadingRNFragment;
            com.meituan.android.bus.a.a().a(this);
        }

        @Subscribe
        public void onClickImButton(com.sankuai.waimai.store.event.b bVar) {
            com.sankuai.waimai.store.platform.domain.manager.poi.a l;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4785505ee7064c0a5f0f0f94f161339f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4785505ee7064c0a5f0f0f94f161339f");
            } else if (bVar == null || bVar.d != this.b.b().getRootViewTag() || (l = com.sankuai.waimai.store.order.a.e().l(bVar.a)) == null) {
            } else {
                com.sankuai.waimai.store.shopping.cart.util.d.a(this.b.getActivity(), l, SCPageConfig.b, bVar.c);
            }
        }
    }
}
