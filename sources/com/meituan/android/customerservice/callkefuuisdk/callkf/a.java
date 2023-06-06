package com.meituan.android.customerservice.callkefuuisdk.callkf;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.TypedArray;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callkefuuisdk.c;
import com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFRingService;
import com.meituan.android.customerservice.callkefuuisdk.e;
import com.meituan.android.customerservice.cscallsdk.b;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.kit.call.BasePresenter;
import com.meituan.android.customerservice.kit.utils.HeadSetChangedManager;
import com.meituan.android.customerservice.kit.widget.BaseFloatView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends BasePresenter implements com.meituan.android.customerservice.cscallsdk.b, d.a, d.c, HeadSetChangedManager.a {
    public static ChangeQuickRedirect a;
    public static c m;
    Application b;
    InterfaceC0241a c;
    AudioManager d;
    com.meituan.android.customerservice.callkefuuisdk.callkf.b e;
    boolean f;
    boolean g;
    boolean h;
    String i;
    ServiceConnection j;
    CallKFRingService.a k;
    TypedArray l;
    private boolean p;
    private Handler q;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.callkefuuisdk.callkf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0241a {
        Activity a();

        void a(int i);

        void a(CharSequence charSequence);

        ImageView b();

        void b(int i);

        void b(CharSequence charSequence);

        TextView c();

        void c(int i);

        TextView d();

        void d(int i);

        ImageView e();

        void e(int i);

        TextView f();

        void f(int i);

        LinearLayout g();

        void g(int i);

        void h(int i);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onAcceptInviteTimeout(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onApp2PhoneChange(b.c cVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onCallEstablishing(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onInvited(b.f fVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onJoinCallRes(b.d dVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onMakeCallSuccess(b.a aVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onNetQualityChange(b.g gVar) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onOtherDeviceAccept(int i) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onOtherDeviceReject(int i) {
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onRejoinSuccess(b.a aVar) {
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ecb2b846f9a4bfa9ec5bfca2eb6ddb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ecb2b846f9a4bfa9ec5bfca2eb6ddb1e");
            return;
        }
        Class<?> cls = aVar.getClass();
        CallLog.log(cls, "showCallMakingState" + d.j().g().g());
        if (d.j().g().g()) {
            aVar.c.b(aVar.c.a().getResources().getString(R.string.cs_voip_call_ring));
        } else {
            aVar.c.b(aVar.c.a().getResources().getString(R.string.cs_voip_call_wait));
        }
        aVar.c.d().setVisibility(4);
        aVar.c.b().setEnabled(false);
        d.j().a((d.c) aVar);
    }

    public a(InterfaceC0241a interfaceC0241a, Application application) {
        Object[] objArr = {interfaceC0241a, application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2988c90eb6c4769aedd1dc5353767e44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2988c90eb6c4769aedd1dc5353767e44");
            return;
        }
        this.c = interfaceC0241a;
        this.b = application;
        this.d = (AudioManager) application.getSystemService("audio");
        this.e = new com.meituan.android.customerservice.callkefuuisdk.callkf.b(this.c.d());
        this.q = new Handler(Looper.getMainLooper());
        this.l = e.a(this.b).f;
        this.i = AppUtil.generatePageInfoKey(this.c.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b29e60b0c8289d1dbf903a11a2b310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b29e60b0c8289d1dbf903a11a2b310");
            return;
        }
        TypedArray typedArray = this.l;
        int i = R.drawable.cs_voip_mute;
        if (typedArray != null) {
            this.c.f(this.g ? this.l.getResourceId(5, R.drawable.cs_voip_mute_checked) : this.l.getResourceId(4, R.drawable.cs_voip_mute));
            return;
        }
        InterfaceC0241a interfaceC0241a = this.c;
        if (this.g) {
            i = R.drawable.cs_voip_mute_checked;
        }
        interfaceC0241a.f(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23929c509b056541efb4eff8a6ea7ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23929c509b056541efb4eff8a6ea7ee");
            return;
        }
        TypedArray typedArray = this.l;
        int i = R.drawable.cs_voip_hands_free;
        if (typedArray != null) {
            this.c.g(this.h ? this.l.getResourceId(12, R.drawable.cs_voip_hands_free_checked) : this.l.getResourceId(11, R.drawable.cs_voip_hands_free));
            return;
        }
        InterfaceC0241a interfaceC0241a = this.c;
        if (this.h) {
            i = R.drawable.cs_voip_hands_free_checked;
        }
        interfaceC0241a.g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ed665f2eaab0625267dd25642f601c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ed665f2eaab0625267dd25642f601c");
        } else {
            this.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ab0adb511c4906f0b83a65030c8ac2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ab0adb511c4906f0b83a65030c8ac2");
                    } else {
                        a.this.b();
                    }
                }
            });
        }
    }

    HashMap<String, String> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387dfabc2753c5f65e976d39d8b0aa41", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387dfabc2753c5f65e976d39d8b0aa41");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Intent intent = this.c.a().getIntent();
        if (intent == null || intent.getExtras() == null) {
            return hashMap;
        }
        try {
            return (HashMap) f.c(intent, "call_associated_data");
        } catch (Exception unused) {
            return hashMap;
        }
    }

    HashMap<String, String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a4ef570950db71b6742465397c1351", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a4ef570950db71b6742465397c1351");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Intent intent = this.c.a().getIntent();
        if (intent == null || intent.getExtras() == null) {
            return hashMap;
        }
        try {
            return (HashMap) f.c(intent, "call_init_data");
        } catch (Exception unused) {
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c5cb25180a77a1448bb47262e0d589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c5cb25180a77a1448bb47262e0d589");
        } else {
            this.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4902168ef334f5c9cae5ec2420f7f06b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4902168ef334f5c9cae5ec2420f7f06b");
                        return;
                    }
                    int i2 = i;
                    if (i2 != 3) {
                        switch (i2) {
                            case 0:
                                a.a(a.this);
                                return;
                            case 1:
                                a.a(a.this);
                                return;
                            default:
                                return;
                        }
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5ffce54a866cac6799aa9f4acd565ffe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5ffce54a866cac6799aa9f4acd565ffe");
                        return;
                    }
                    aVar.c.b(aVar.c.a().getResources().getString(R.string.cs_voip_call_talking));
                    aVar.c.d().setVisibility(0);
                    com.meituan.android.customerservice.callkefuuisdk.callkf.b bVar = aVar.e;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.customerservice.callkefuuisdk.callkf.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "c2319537e30baa3bf5525dbe9db42307", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "c2319537e30baa3bf5525dbe9db42307");
                    } else {
                        bVar.d.postDelayed(bVar.e, 300L);
                    }
                    aVar.c.a().setVolumeControlStream(0);
                    aVar.c.b().setEnabled(true);
                }
            });
        }
    }

    @Override // com.meituan.android.customerservice.kit.utils.HeadSetChangedManager.a
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d074943ff358510b7d7bf06a2015fefb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d074943ff358510b7d7bf06a2015fefb");
        } else if ((str == "bluetooth" && i == 2) || (str == "wired" && i == 1)) {
            this.h = false;
            c();
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onMakeCallTimeout(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf05537c4eed4946c6c3b747c11fa1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf05537c4eed4946c6c3b747c11fa1d");
        } else if (f()) {
        } else {
            com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_make_call_timeout);
            g();
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onTalking() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca97a489e9e7fb56a5a47a6f08bdb75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca97a489e9e7fb56a5a47a6f08bdb75");
        } else {
            a(3);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onError(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e37b8ac3b0db7069f105ed44834227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e37b8ac3b0db7069f105ed44834227");
            return;
        }
        CallKFRingService.a(this.c.a());
        if (f()) {
            return;
        }
        if (dVar.f == 10004) {
            com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_net_disable);
        } else {
            com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_call_error);
        }
        g();
    }

    @Override // com.meituan.android.customerservice.cscallsdk.b
    public final void onCallEnd(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dee062850115fbbf675b2cb20610d18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dee062850115fbbf675b2cb20610d18");
        } else if (f()) {
        } else {
            int i = dVar.f;
            if (i == 5) {
                com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_call_peer_offline);
            } else if (i == 10004) {
                com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_net_disable);
            } else {
                switch (i) {
                    case 1:
                        com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_call_peer_busy);
                        break;
                    case 2:
                        com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_call_peer_reject);
                        break;
                    default:
                        com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this.c.a(), (int) R.string.cs_voip_call_end);
                        break;
                }
            }
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean f() {
        return this.p;
    }

    synchronized void a(boolean z) {
        this.p = true;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63acdeeedb6ced74d0664f7b79e9f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63acdeeedb6ced74d0664f7b79e9f0d");
            return;
        }
        a(true);
        this.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "635e313831381d91dca3b880521e9a6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "635e313831381d91dca3b880521e9a6f");
                } else {
                    a.this.c.b().setEnabled(false);
                }
            }
        });
        this.q.postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f4453fed6f8757542dcef6eda2165c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f4453fed6f8757542dcef6eda2165c9");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8e4429ebac4e8b24083ff8c19e8f3414", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8e4429ebac4e8b24083ff8c19e8f3414");
                    return;
                }
                aVar.a(true);
                aVar.c.a().finish();
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c943d66bd4dc11de4cff0aacb8ed18e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c943d66bd4dc11de4cff0aacb8ed18e0");
        } else {
            this.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d71b352d39b23bdaa113554cc963eced", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d71b352d39b23bdaa113554cc963eced");
                    } else {
                        a.this.c.b(a.this.c.a().getResources().getString(R.string.cs_voip_call_ring));
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d.c
    public final void a(int i, final int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595cca608b266532b5c34351128b35fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595cca608b266532b5c34351128b35fe");
        } else if (i != 0) {
        } else {
            this.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b994eeee088e59ab16c0e912a21dfaf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b994eeee088e59ab16c0e912a21dfaf2");
                        return;
                    }
                    a aVar = a.this;
                    int i4 = i2;
                    Object[] objArr3 = {Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3be604d4bf0967b2b5f29b0bd3bd4544", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3be604d4bf0967b2b5f29b0bd3bd4544");
                        return;
                    }
                    switch (i4) {
                        case 1:
                        case 2:
                            aVar.c.e().setImageResource(R.drawable.signal_4);
                            aVar.c.e().setVisibility(0);
                            aVar.c.f().setVisibility(8);
                            return;
                        case 3:
                            aVar.c.e().setImageResource(R.drawable.signal_3);
                            aVar.c.e().setVisibility(0);
                            aVar.c.f().setVisibility(8);
                            return;
                        case 4:
                            aVar.c.e().setImageResource(R.drawable.signal_2);
                            aVar.c.e().setVisibility(0);
                            aVar.c.f().setVisibility(0);
                            CallLog.i(aVar.getClass(), "Media quality bad");
                            return;
                        case 5:
                        case 6:
                            aVar.c.e().setImageResource(R.drawable.signal_1);
                            aVar.c.e().setVisibility(0);
                            aVar.c.f().setVisibility(0);
                            CallLog.i(aVar.getClass(), "Media quality vbad");
                            return;
                        default:
                            aVar.c.e().setVisibility(8);
                            aVar.c.f().setVisibility(8);
                            return;
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class b implements com.meituan.android.customerservice.kit.floating.base.c {
        public static ChangeQuickRedirect a;
        public com.meituan.android.customerservice.callkefuuisdk.widget.a b;

        public b(com.meituan.android.customerservice.callkefuuisdk.widget.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe7f1987a692b0765c87726012d719b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe7f1987a692b0765c87726012d719b");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.meituan.android.customerservice.kit.floating.base.c
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2f173e67d0360ad3a7fd8c25a581b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2f173e67d0360ad3a7fd8c25a581b6");
            } else if (this.b == null) {
            } else {
                if (i == 1) {
                    this.b.a();
                } else if (i == 3) {
                    com.meituan.android.customerservice.callkefuuisdk.widget.a aVar = this.b;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = BaseFloatView.b;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4286526c7461f63f77135891cad71a08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4286526c7461f63f77135891cad71a08");
                    } else {
                        aVar.getTalkingTimekeeper().a();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbecb7fa482fe2ec77548d9ce195d643", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbecb7fa482fe2ec77548d9ce195d643");
        }
        if (d.j().g().d() == 1) {
            return "c_cs_jhkfam5v";
        }
        if (d.j().g().d() == 3) {
            return "c_cs_h0wake03";
        }
        return null;
    }
}
