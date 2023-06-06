package com.sankuai.waimai.ugc.creator.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.gson.Gson;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.manager.f;
import com.sankuai.waimai.ugc.creator.utils.e;
import com.sankuai.waimai.ugc.creator.utils.i;
import com.sankuai.waimai.ugc.creator.utils.n;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.tencent.connect.share.QzonePublish;
import com.tencent.mapsdk.internal.y;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect e;
    protected String f;
    protected String[] g;
    protected String[] h;
    protected String[] i;
    protected String[] j;
    protected String[] k;
    protected String l;
    protected boolean m;

    public void b(@NonNull View view) {
    }

    public void bK_() {
    }

    public abstract String[] c();

    public void d() {
    }

    public void k() {
    }

    public void l() {
    }

    public static /* synthetic */ void a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2ec2ea8516db96f4f1b895bceaaf45b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2ec2ea8516db96f4f1b895bceaaf45b3");
        } else if (o.a(aVar.B())) {
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            new RooAlertDialog.a(new ContextThemeWrapper(aVar.A(), 2131558962)).b(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d03cb947d29131a2c46f57b234178fa1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d03cb947d29131a2c46f57b234178fa1") : aVar.a(com.sankuai.waimai.ugc.creator.utils.c.c(list))).a(false).a("去设置", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.base.a.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc6944a8a26b3ccbfde9b84b381e9b56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc6944a8a26b3ccbfde9b84b381e9b56");
                        return;
                    }
                    dialogInterface.dismiss();
                    Activity B = a.this.B();
                    Object[] objArr4 = {B, (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect4 = i.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c3c2724f3b224c617bca1b0bc8c5b6ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c3c2724f3b224c617bca1b0bc8c5b6ba");
                    } else if (o.a(B)) {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + B.getPackageName()));
                        intent.addFlags(y.a);
                        if (B.getPackageManager().resolveActivity(intent, 65536) != null) {
                            try {
                                B.startActivity(intent);
                            } catch (Exception unused) {
                                Intent intent2 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
                                intent2.addFlags(y.a);
                                if (B.getPackageManager().resolveActivity(intent2, 65536) != null) {
                                    B.startActivity(intent2);
                                }
                            }
                        } else {
                            Intent intent3 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
                            intent3.addFlags(y.a);
                            if (B.getPackageManager().resolveActivity(intent3, 65536) != null) {
                                B.startActivity(intent3);
                            }
                        }
                        if (B instanceof Activity) {
                            B.finish();
                        }
                    }
                }
            }).b(IPaymentManager.NO_ACTION, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.base.a.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d057df14b8f3278c66f6e51cf7c555b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d057df14b8f3278c66f6e51cf7c555b");
                        return;
                    }
                    dialogInterface.dismiss();
                    a.this.bL_();
                }
            }).b();
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1ba496e6148aeb0a3fe56241683b8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1ba496e6148aeb0a3fe56241683b8d");
            return;
        }
        this.g = new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.PERMISSION_STORAGE};
        this.h = new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_STORAGE};
        this.i = new String[]{PermissionGuard.PERMISSION_STORAGE};
        this.j = new String[]{PermissionGuard.PERMISSION_MULTIPLE_IMAGE_PICKERS};
        this.k = new String[]{PermissionGuard.PERMISSION_STORAGE_READ};
        this.m = true;
    }

    public a(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b690c831f6f569e830eb90c0593a0d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b690c831f6f569e830eb90c0593a0d7");
            return;
        }
        this.g = new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.PERMISSION_STORAGE};
        this.h = new String[]{PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_STORAGE};
        this.i = new String[]{PermissionGuard.PERMISSION_STORAGE};
        this.j = new String[]{PermissionGuard.PERMISSION_MULTIPLE_IMAGE_PICKERS};
        this.k = new String[]{PermissionGuard.PERMISSION_STORAGE_READ};
        this.m = true;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b, com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839ef4ab18cc5f2daa9410a1568d0868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839ef4ab18cc5f2daa9410a1568d0868");
            return;
        }
        com.sankuai.waimai.ugc.creator.utils.b.a = B().getApplicationContext();
        this.f = getClass().getSimpleName();
        this.l = getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this));
        super.a(bundle);
        n.a("onCreate");
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8a61791e9bb4234195016e2774052c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8a61791e9bb4234195016e2774052c");
            return;
        }
        super.a(view);
        n.a("onViewCreated");
        Activity B = B();
        View view2 = this.s;
        Object[] objArr2 = {B, view2};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b20af0497662d59a6ac026d98b62cd2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b20af0497662d59a6ac026d98b62cd2b");
        } else if (o.a(B)) {
            e.a(B.getWindow(), view2);
        }
        b(view);
        if (this.m) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "22eac96e271e85704f6f1819e8d9dfbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "22eac96e271e85704f6f1819e8d9dfbf");
                return;
            } else {
                f.a(B(), new com.sankuai.waimai.ugc.creator.manager.b() { // from class: com.sankuai.waimai.ugc.creator.base.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.ugc.creator.manager.b
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d6aa7a9561aa33a33de503c0ab37f6b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d6aa7a9561aa33a33de503c0ab37f6b1");
                        } else if (o.a(a.this.A())) {
                            a.this.bK_();
                            a.this.g();
                        }
                    }

                    @Override // com.sankuai.waimai.ugc.creator.manager.b
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ada831b35960eafee68cc8c003123991", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ada831b35960eafee68cc8c003123991");
                        } else if (o.a(a.this.A())) {
                            final a aVar = a.this;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a.e;
                            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "aa8d9e21aec744d717210bcdee39d7e1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "aa8d9e21aec744d717210bcdee39d7e1");
                            } else {
                                new RooAlertDialog.a(new ContextThemeWrapper(aVar.A(), 2131558962)).b(R.string.wm_ugc_video_init_failed).a(R.string.wm_ugc_video_alert_dialog_positive_btn_text, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.base.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        Object[] objArr6 = {dialogInterface, Integer.valueOf(i)};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "853ae17e0edc556f0dd048dbf2eed973", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "853ae17e0edc556f0dd048dbf2eed973");
                                        } else {
                                            a.this.r();
                                        }
                                    }
                                }).a(false).b();
                            }
                        }
                    }
                });
                return;
            }
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f3052ff081f1f32bb4a781039cd992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f3052ff081f1f32bb4a781039cd992");
            return;
        }
        n.a("checkPermissions");
        i.a(B(), this.o.v, c(), new i.a() { // from class: com.sankuai.waimai.ugc.creator.base.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.utils.i.a
            public final void a(List<String> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d4d43e83819e1c6716148c3ff32099a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d4d43e83819e1c6716148c3ff32099a");
                    return;
                }
                final a aVar = a.this;
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a.e;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "eb016ea8088c82d636964bb87a5057cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "eb016ea8088c82d636964bb87a5057cf");
                } else if (o.a(aVar.B())) {
                    new RooAlertDialog.a(new ContextThemeWrapper(aVar.A(), 2131558962)).a(false).b(aVar.B().getString(R.string.wm_ugc_media_permission_request_rationale_for_controlled, new Object[]{com.sankuai.waimai.ugc.creator.utils.c.c(list)})).a("确认", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.base.a.6
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr4 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c46352305b39410456bec6b8f6b3801e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c46352305b39410456bec6b8f6b3801e");
                                return;
                            }
                            dialogInterface.dismiss();
                            a.this.bL_();
                        }
                    }).b();
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.utils.i.a
            public final void b(List<String> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e22029ba493c1649ab6076abdc638c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e22029ba493c1649ab6076abdc638c1");
                } else {
                    a.this.d();
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.utils.i.a
            public final void a(List<String> list, List<String> list2) {
                Object[] objArr2 = {list, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6da09e955e8e5fef1260883d34c6f3ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6da09e955e8e5fef1260883d34c6f3ef");
                } else {
                    a.a(a.this, list2);
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.utils.i.a
            public final void c(List<String> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce3172f8ef1582a90b6eab97ee8f21f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce3172f8ef1582a90b6eab97ee8f21f4");
                } else {
                    a.a(a.this, list);
                }
            }
        });
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f420dea2d4d85aff8334cf8213e4e71", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f420dea2d4d85aff8334cf8213e4e71") : B().getString(R.string.wm_ugc_media_permission_request_rationale_default, new Object[]{str});
    }

    public void bL_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52804a976fe727d6a25853402440eca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52804a976fe727d6a25853402440eca3");
        } else {
            r();
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60bb50d5786cadced6f337789c2ff1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60bb50d5786cadced6f337789c2ff1d")).booleanValue();
        }
        l();
        return true;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7d03f37bc45db5d2b67146eba67c07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7d03f37bc45db5d2b67146eba67c07")).booleanValue();
        }
        k();
        return true;
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f183bd3716032f1a0a89b19c0b497ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f183bd3716032f1a0a89b19c0b497ba4");
        } else {
            a(0, new Bundle());
        }
    }

    public final void a(ArrayList<ImageData> arrayList, int i, int i2) {
        Object[] objArr = {arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0fc967c27f48e31575b1294cfe0a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0fc967c27f48e31575b1294cfe0a35");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("input_media_data_list", arrayList);
        bundle.putInt("addImageMode", i);
        bundle.putInt("firstNewImageIndex", i2);
        a(-1, bundle);
    }

    public final void a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafdf065e563ac803ac2531481d75138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafdf065e563ac803ac2531481d75138");
        } else {
            a(com.sankuai.waimai.ugc.creator.utils.c.a(list), 1);
        }
    }

    public final void b(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb5bfe8d746c8c45d063919585568c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb5bfe8d746c8c45d063919585568c1");
            return;
        }
        c(videoData);
        ArrayList arrayList = new ArrayList();
        arrayList.add(videoData);
        a(com.sankuai.waimai.ugc.creator.utils.c.b(arrayList), 2);
    }

    public final void a(List<com.sankuai.waimai.ugc.creator.entity.c> list, int i) {
        String str;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6adb6c32f17538910e777effdd25418d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6adb6c32f17538910e777effdd25418d");
            return;
        }
        try {
            str = new Gson().toJson(list);
        } catch (Exception unused) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putInt("mediaType", i);
        bundle.putString("mediaList", str);
        if (!TextUtils.isEmpty(this.o.u)) {
            bundle.putString("resultJumpUri", this.o.u);
            b(bundle);
            return;
        }
        a(-1, bundle);
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38dec9349ffe23086ad20e6fa03da9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38dec9349ffe23086ad20e6fa03da9ad");
            return;
        }
        n.a("quitVideoProcedureOld");
        if (t()) {
            b(i, str);
        }
        a(0, new Bundle());
    }

    private void b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6729bd6b18dcd8ff0d2fe9c128de97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6729bd6b18dcd8ff0d2fe9c128de97");
        } else if (o.a(B())) {
            Intent intent = new Intent();
            intent.putExtra(Constant.KEY_RESULT_CODE, i);
            intent.putExtra("resultMsg", str);
            intent.setAction("com.sankuai.meituan.takeoutnew.ugc.VIDEO_GENERATE_RESULT");
            B().sendBroadcast(intent);
            n.a("sendVideoProcedureCancelBroadcast");
        }
    }

    public final void c(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22204d366581ea740640772f54f272fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22204d366581ea740640772f54f272fc");
        } else if (o.a(B())) {
            Bundle a = a(videoData.h, videoData.r, videoData.t.h, videoData.t.r, videoData.l, videoData.m, videoData.b, videoData.n, true);
            Intent intent = new Intent();
            intent.putExtras(a);
            intent.putExtra(Constant.KEY_RESULT_CODE, 1);
            intent.setAction("com.sankuai.meituan.takeoutnew.ugc.VIDEO_GENERATE_RESULT");
            B().sendBroadcast(intent);
            n.a("sendCompleteBroadcast");
        }
    }

    private void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7179f719325824f594216f7aa9e8e3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7179f719325824f594216f7aa9e8e3c9");
            return;
        }
        n.a("finishActivity->" + bundle.toString());
        if (o.a(B())) {
            if (t()) {
                c(bundle);
                return;
            }
            Intent intent = new Intent();
            intent.putExtras(bundle);
            B().setResult(-102, intent);
            B().finish();
        }
    }

    private void c(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ae4ba323f4c8f6e9f8d2972f6a7a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ae4ba323f4c8f6e9f8d2972f6a7a18");
            return;
        }
        String string = bundle.getString("resultJumpUri");
        if (!TextUtils.isEmpty(string)) {
            com.sankuai.waimai.foundation.router.a.a(B(), string, bundle);
        }
        B().finish();
    }

    public final void a(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64695eeb281e1ad449d583a14907d7e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64695eeb281e1ad449d583a14907d7e9");
            return;
        }
        n.a("finishActivity->" + bundle.toString());
        if (o.a(B())) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            B().setResult(i, intent);
            B().finish();
        }
    }

    public final void a(VideoData videoData, long j, long j2) {
        Object[] objArr = {videoData, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b067d7b198b47af3855ad1fd7cdb7ec4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b067d7b198b47af3855ad1fd7cdb7ec4");
            return;
        }
        n.a("startVideoFilterActivity");
        Bundle bundle = new Bundle();
        bundle.putParcelable("input_media_data", videoData);
        bundle.putLong("clipStartTime", j);
        bundle.putLong("clipEndTime", j2);
        a(bundle, "wm_router://page/wmvideoedit", 13);
    }

    public final void a(MediaData mediaData) {
        Object[] objArr = {mediaData};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10e443e6942658d3435085ae6510759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10e443e6942658d3435085ae6510759");
            return;
        }
        n.a("startVideoFilterActivity");
        Bundle bundle = new Bundle();
        bundle.putParcelable("input_media_data", mediaData);
        a(bundle, "wm_router://page/wmmediapreview", 14);
    }

    public final void d(VideoData videoData) {
        Object[] objArr = {videoData};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da9df2b6561182f0b065dffb9c18fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da9df2b6561182f0b065dffb9c18fe3");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("input_media_data", videoData);
        a(bundle, "wm_router://page/wmvideoclip", 12);
    }

    public final void a(ArrayList<ImageData> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9922b3b60d1201a0fc9d0f1210748ec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9922b3b60d1201a0fc9d0f1210748ec2");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("input_media_data_list", arrayList);
        bundle.putInt("index", i);
        a(bundle, "wm_router://page/editimage", 16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle a(String str, String str2, String str3, String str4, int i, int i2, long j, long j2, boolean z) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), new Long(j2), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8079cbbd1185f779145df5c3a511e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8079cbbd1185f779145df5c3a511e2e");
        }
        Bundle bundle = new Bundle();
        bundle.putString("videoCoverId", str4);
        bundle.putString("videoCoverPath", str3);
        bundle.putString("videoId", str2);
        bundle.putString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, str);
        bundle.putInt("width", i);
        bundle.putInt("height", i2);
        bundle.putInt("duration", (int) j);
        bundle.putLong(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, j2);
        bundle.putBoolean("isSaveVideo", true);
        return bundle;
    }

    @Override // com.sankuai.waimai.ugc.creator.base.b
    public boolean a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d0f63d0e07839b37302c7b3faa633a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d0f63d0e07839b37302c7b3faa633a")).booleanValue();
        }
        if (intent != null && intent.getExtras() != null && o.a(B())) {
            if (i2 == -1) {
                a(-1, intent.getExtras());
            } else if (i2 == -102) {
                if (t()) {
                    c(intent.getExtras());
                } else {
                    a(-102, intent.getExtras());
                }
            }
        }
        return true;
    }
}
