package com.meituan.android.identifycardrecognizer.adapter;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.meituan.android.identifycardrecognizer.bean.PhotoFolder;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"_display_name", "_data", "bucket_id", "bucket_display_name"};

    public static List<PhotoFolder> a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47a44245b00cc7e3f3e536c3bf6ef2b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47a44245b00cc7e3f3e536c3bf6ef2b5");
        }
        ArrayList arrayList = new ArrayList();
        if (Privacy.createPermissionGuard() == null || Privacy.createPermissionGuard().a(context, PermissionGuard.PERMISSION_STORAGE_READ, "jf-a46271f439dbd2ff") <= 0) {
            return arrayList;
        }
        Cursor query = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, null, "date_added");
        HashMap hashMap = new HashMap();
        while (query.moveToNext()) {
            try {
                String string = query.getString(1);
                String string2 = query.getString(2);
                String string3 = query.getString(3);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                    if (!hashMap.containsKey(string2)) {
                        PhotoFolder photoFolder = new PhotoFolder();
                        photoFolder.setName(string3);
                        photoFolder.setThumbnail(string);
                        photoFolder.setCount(1);
                        photoFolder.getPhotoList().add(string);
                        hashMap.put(string2, photoFolder);
                    } else {
                        PhotoFolder photoFolder2 = (PhotoFolder) hashMap.get(string2);
                        photoFolder2.setCount(photoFolder2.getCount() + 1);
                        photoFolder2.getPhotoList().add(0, string);
                    }
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        for (Map.Entry entry : hashMap.entrySet()) {
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
