package com.meituan.msi.api.contact;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.ContactsContract;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ChooseContactApi implements IMsiApi, g {
    public static ChangeQuickRedirect a;
    private String b;

    @MsiApiMethod(name = "chooseContact", request = ChooseContactParam.class, response = ChooseContactResponse.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_CONTACTS_READ})
    public void chooseContact(ChooseContactParam chooseContactParam, MsiContext msiContext) {
        Object[] objArr = {chooseContactParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6316925606f18527c73c2e2fdf5d6b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6316925606f18527c73c2e2fdf5d6b3e");
            return;
        }
        this.b = chooseContactParam._mt == null ? "" : chooseContactParam._mt.sceneToken;
        try {
            Intent intent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
            List<ResolveInfo> queryIntentActivities = a.f().getPackageManager().queryIntentActivities(intent, 1114112);
            if (queryIntentActivities.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.contains("contacts")) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                }
                if (arrayList.size() == 1) {
                    intent.setPackage((String) arrayList.get(0));
                } else if (arrayList.size() > 1 && arrayList.contains("com.android.contacts")) {
                    intent.setPackage("com.android.contacts");
                }
            }
            msiContext.startActivityForResult(intent, 97);
        } catch (Throwable unused) {
            msiContext.onError(500, "inner error");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: all -> 0x00f6, Exception -> 0x010b, TRY_LEAVE, TryCatch #6 {Exception -> 0x010b, all -> 0x00f6, blocks: (B:23:0x00ac, B:25:0x00b9, B:27:0x00ce, B:29:0x00d6, B:35:0x00e7), top: B:69:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7 A[Catch: all -> 0x00f6, Exception -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x010b, all -> 0x00f6, blocks: (B:23:0x00ac, B:25:0x00b9, B:27:0x00ce, B:29:0x00d6, B:35:0x00e7), top: B:69:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    @Override // com.meituan.msi.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19, android.content.Intent r20, com.meituan.msi.bean.MsiContext r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.contact.ChooseContactApi.a(int, android.content.Intent, com.meituan.msi.bean.MsiContext):void");
    }
}
