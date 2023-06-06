package com.meituan.android.edfu.mvex.ui.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AlbumButtonView extends FrameLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public a b;
    private boolean c;
    private Context d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed53eb4a6976b88875e3725e7b643c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed53eb4a6976b88875e3725e7b643c61");
        }
    }

    public static /* synthetic */ void a(AlbumButtonView albumButtonView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, albumButtonView, changeQuickRedirect, false, "ff0acafd2c157df54ddc592a62b57f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, albumButtonView, changeQuickRedirect, false, "ff0acafd2c157df54ddc592a62b57f75");
            return;
        }
        boolean z = Privacy.createPermissionGuard().a(albumButtonView.d, PermissionGuard.PERMISSION_STORAGE_READ, com.meituan.android.edfu.mvex.constants.a.b()) != -4;
        if (albumButtonView.c || z) {
            return;
        }
        final Activity activity = (Activity) albumButtonView.d;
        String string = albumButtonView.d.getString(R.string.mvex_dialog_msg_authority);
        Object[] objArr2 = {activity, string};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, albumButtonView, changeQuickRedirect2, false, "b6c11e02f75e7556adf1b370b198d600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, albumButtonView, changeQuickRedirect2, false, "b6c11e02f75e7556adf1b370b198d600");
        } else if (activity == null) {
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            builder.setMessage(string);
            builder.setPositiveButton(activity.getString(R.string.mvex_dialog_btn_setting), new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.AlbumButtonView.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b5c46d3ba0be99a2de65447af8bd6d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b5c46d3ba0be99a2de65447af8bd6d0");
                        return;
                    }
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                    activity.startActivity(intent);
                }
            });
            builder.setNegativeButton(activity.getString(R.string.mvex_dialog_btn_cancel), new DialogInterface.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.AlbumButtonView.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr3 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ed567057f72d986677deeaec12cda54", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ed567057f72d986677deeaec12cda54");
                        return;
                    }
                    dialogInterface.dismiss();
                    AlbumButtonView.this.a();
                }
            });
            if (activity.isFinishing()) {
                return;
            }
            builder.create().show();
        }
    }

    public AlbumButtonView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fab6cec7deb73e2183585c3154c52d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fab6cec7deb73e2183585c3154c52d");
        } else {
            a(context);
        }
    }

    public AlbumButtonView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7293f92cb86911e66edc6613bb72eefa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7293f92cb86911e66edc6613bb72eefa");
        } else {
            a(context);
        }
    }

    public AlbumButtonView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bc3ae75856a18947af7ff686454112c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bc3ae75856a18947af7ff686454112c");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f519513467e69f0cf3cb830f5b3c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f519513467e69f0cf3cb830f5b3c98");
            return;
        }
        this.d = context;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_album_view, (ViewGroup) this, true);
        setOnClickListener(this);
    }

    public void setResultListener(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0904aa9b87068e6bd313234ac12eb5e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0904aa9b87068e6bd313234ac12eb5e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b1b115dd55ef4edb33214e27a8d294f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b1b115dd55ef4edb33214e27a8d294f");
        } else {
            int a2 = Privacy.createPermissionGuard().a(this.d, PermissionGuard.PERMISSION_STORAGE_READ, com.meituan.android.edfu.mvex.constants.a.b());
            if (a2 > 0) {
                getPicFromAlbum();
            } else {
                this.c = a2 != -4;
                Privacy.createPermissionGuard().a((Activity) this.d, PermissionGuard.PERMISSION_STORAGE_READ, com.meituan.android.edfu.mvex.constants.a.b(), (d) new g() { // from class: com.meituan.android.edfu.mvex.ui.widget.AlbumButtonView.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str, int i) {
                        Object[] objArr3 = {str, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57ee5a27099cd97f899e892985950fd6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57ee5a27099cd97f899e892985950fd6");
                        } else if (i > 0) {
                            AlbumButtonView.this.getPicFromAlbum();
                        } else {
                            AlbumButtonView.a(AlbumButtonView.this, i);
                        }
                    }
                });
            }
        }
        Statistics.getChannel("group").writeModelClick(AppUtil.generatePageInfoKey(this), "b_group_s50d9ufb_mc", (Map<String, Object>) null, "c_group_rtj4cvhh");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPicFromAlbum() {
        Intent intent;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2edf071bb7bc6f0da52f116c6e44781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2edf071bb7bc6f0da52f116c6e44781");
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        } else {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        try {
            ((Activity) this.d).startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException e) {
            Object[] objArr2 = {e.getMessage()};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41bfa9674688dc2c1a6e15bd83ddc721", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41bfa9674688dc2c1a6e15bd83ddc721");
            }
        }
    }
}
