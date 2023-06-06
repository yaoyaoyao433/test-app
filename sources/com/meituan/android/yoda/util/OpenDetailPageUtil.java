package com.meituan.android.yoda.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class OpenDetailPageUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public interface DetailDialogCallback {
        void negativecallback();

        void positivecallback();
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4) {
        Object[] objArr = {activity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "452202c4a8df2672bab372b1658a13c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "452202c4a8df2672bab372b1658a13c2");
            return;
        }
        AlertDialog.a aVar = new AlertDialog.a(activity);
        if (!TextUtils.isEmpty(str)) {
            aVar.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.b(str2);
        }
        c cVar = new c(activity, aVar);
        a aVar2 = new a(activity, aVar);
        if (!TextUtils.isEmpty(str4)) {
            aVar.b(str4, cVar);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.a(str3, aVar2);
        }
        aVar.a(false);
        AlertDialog b2 = aVar.b();
        b2.a(-2).setTextColor(x.b((int) R.color.yoda_colorPrimary));
        b2.a(-1).setTextColor(x.b((int) R.color.yoda_colorPrimary));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ AlertDialog.a c;

        public c(Activity activity, AlertDialog.a aVar) {
            this.b = activity;
            this.c = aVar;
            Object[] objArr = {activity, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c7aada2490de234a9bd1e58f4838c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c7aada2490de234a9bd1e58f4838c7");
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Object[] objArr = {dialogInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7be49fe5f5e8099dcb8a0eec03dfdf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7be49fe5f5e8099dcb8a0eec03dfdf0");
                return;
            }
            dialogInterface.dismiss();
            this.b.finish();
            this.c.a("", (DialogInterface.OnClickListener) null);
            ((AlertDialog) dialogInterface).a(-1, "", null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ AlertDialog.a c;

        public a(Activity activity, AlertDialog.a aVar) {
            this.b = activity;
            this.c = aVar;
            Object[] objArr = {activity, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d65cd1940bfc85dec05512c4943171e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d65cd1940bfc85dec05512c4943171e");
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Object[] objArr = {dialogInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6181a6aa599afe0a9746de72b2c6f5df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6181a6aa599afe0a9746de72b2c6f5df");
                return;
            }
            dialogInterface.dismiss();
            OpenDetailPageUtil.a(this.b);
            this.c.b("", (DialogInterface.OnClickListener) null);
            ((AlertDialog) dialogInterface).a(-2, "", null);
        }
    }

    public static void a(WeakReference<Activity> weakReference, String str, String str2, String str3, String str4, WeakReference<DetailDialogCallback> weakReference2) {
        Object[] objArr = {weakReference, str, str2, str3, str4, weakReference2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1aac2b82aa7415404ab4b44c2c93771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1aac2b82aa7415404ab4b44c2c93771");
            return;
        }
        Activity activity = weakReference.get();
        if (activity == null) {
            return;
        }
        AlertDialog.a aVar = new AlertDialog.a(activity);
        if (!TextUtils.isEmpty(str)) {
            aVar.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.b(str2);
        }
        k a2 = k.a(new b(weakReference2, aVar));
        k a3 = k.a(new d(activity, weakReference2, aVar));
        if (!TextUtils.isEmpty(str4)) {
            aVar.b(str4, a2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.a(str3, a3);
        }
        aVar.a(false);
        AlertDialog b2 = aVar.b();
        a2.a(b2);
        a3.a(b2);
        b2.a(-2).setTextColor(x.b((int) R.color.yoda_colorPrimary));
        b2.a(-1).setTextColor(x.b((int) R.color.yoda_colorPrimary));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ WeakReference b;
        public final /* synthetic */ AlertDialog.a c;

        public b(WeakReference weakReference, AlertDialog.a aVar) {
            this.b = weakReference;
            this.c = aVar;
            Object[] objArr = {weakReference, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be79cae8836e0de081aeabced94a9848", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be79cae8836e0de081aeabced94a9848");
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Object[] objArr = {dialogInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e46bf3edd66ce8465447335a12ec29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e46bf3edd66ce8465447335a12ec29");
                return;
            }
            dialogInterface.dismiss();
            if (this.b.get() != null) {
                ((DetailDialogCallback) this.b.get()).negativecallback();
            }
            this.c.a("", (DialogInterface.OnClickListener) null);
            ((AlertDialog) dialogInterface).a(-1, "", null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ WeakReference c;
        public final /* synthetic */ AlertDialog.a d;

        public d(Activity activity, WeakReference weakReference, AlertDialog.a aVar) {
            this.b = activity;
            this.c = weakReference;
            this.d = aVar;
            Object[] objArr = {activity, weakReference, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4a20a0eb49c6ca9a18a67140c927e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4a20a0eb49c6ca9a18a67140c927e1");
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Object[] objArr = {dialogInterface, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba6be1950363d8bf91e4b35e7a223c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba6be1950363d8bf91e4b35e7a223c1");
                return;
            }
            dialogInterface.dismiss();
            OpenDetailPageUtil.a(this.b);
            if (this.c.get() != null) {
                ((DetailDialogCallback) this.c.get()).positivecallback();
            }
            this.d.b("", (DialogInterface.OnClickListener) null);
            ((AlertDialog) dialogInterface).a(-2, "", null);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ef9abacc66e963d91653588528c3157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ef9abacc66e963d91653588528c3157");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + activity.getApplicationContext().getPackageName()));
        activity.startActivity(intent);
    }
}
