package com.meituan.msi.api.contact;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.dio.easy.DioFile;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.api.selectedDialog.SelectedDialog;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.log.a;
import com.meituan.msi.util.file.b;
import com.meituan.msi.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AddPhoneContactApi implements IMsiApi, g {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(AddPhoneContactApi addPhoneContactApi, AddPhoneContactParam addPhoneContactParam, MsiContext msiContext) {
        Object[] objArr = {addPhoneContactParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, addPhoneContactApi, changeQuickRedirect, false, "646eaaf0eb7cacb24b043446a075f243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, addPhoneContactApi, changeQuickRedirect, false, "646eaaf0eb7cacb24b043446a075f243");
            return;
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        addPhoneContactApi.a(intent, addPhoneContactParam, msiContext);
        msiContext.startActivityForResult(intent, 97);
    }

    public static /* synthetic */ void b(AddPhoneContactApi addPhoneContactApi, AddPhoneContactParam addPhoneContactParam, MsiContext msiContext) {
        Object[] objArr = {addPhoneContactParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, addPhoneContactApi, changeQuickRedirect, false, "2afd8a65cfed742e9c9fe15f8b0db12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, addPhoneContactApi, changeQuickRedirect, false, "2afd8a65cfed742e9c9fe15f8b0db12d");
            return;
        }
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
        intent.setType("vnd.android.cursor.item/contact");
        addPhoneContactApi.a(intent, addPhoneContactParam, msiContext);
        msiContext.startActivityForResult(intent, 97);
    }

    @MsiApiMethod(name = "addPhoneContact", request = AddPhoneContactParam.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_CONTACTS_WRITE})
    public void addPhoneContact(final AddPhoneContactParam addPhoneContactParam, final MsiContext msiContext) {
        Object[] objArr = {addPhoneContactParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec50ff76599e53efa37ab064cbbdfca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec50ff76599e53efa37ab064cbbdfca7");
            return;
        }
        a.a("chooseContact AddPhoneContactParam: " + addPhoneContactParam.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.meituan.msi.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.msi.api.contact.AddPhoneContactApi.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b49c1a2056d878b7537d4f298452b2a3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b49c1a2056d878b7537d4f298452b2a3");
                } else {
                    AddPhoneContactApi.a(AddPhoneContactApi.this, addPhoneContactParam, msiContext);
                }
            }
        }, "创建新联系人"));
        arrayList.add(new com.meituan.msi.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.msi.api.contact.AddPhoneContactApi.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09e67f27a15f05228bd81fe0c0e329d5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09e67f27a15f05228bd81fe0c0e329d5");
                } else {
                    AddPhoneContactApi.b(AddPhoneContactApi.this, addPhoneContactParam, msiContext);
                }
            }
        }, "添加到现有联系人"));
        new SelectedDialog(msiContext.getActivity(), arrayList).show();
    }

    private void a(Intent intent, AddPhoneContactParam addPhoneContactParam, MsiContext msiContext) {
        ContentValues contentValues;
        ContentValues contentValues2;
        ContentValues contentValues3;
        ContentValues contentValues4;
        ContentValues contentValues5;
        Object[] objArr = {intent, addPhoneContactParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0e2b3636c54ee4085ce25df01c4bdc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0e2b3636c54ee4085ce25df01c4bdc4");
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(addPhoneContactParam.lastName)) {
            sb.append(addPhoneContactParam.lastName);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.middleName)) {
            sb.append(addPhoneContactParam.middleName);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.firstName)) {
            sb.append(addPhoneContactParam.firstName);
        }
        intent.putExtra("name", sb.toString());
        intent.putExtra("email", addPhoneContactParam.email);
        if (!TextUtils.isEmpty(addPhoneContactParam.organization)) {
            String str = addPhoneContactParam.organization;
            String str2 = addPhoneContactParam.title;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbaf40d6e2d1088d2b4a2a19e02c87fa", RobustBitConfig.DEFAULT_VALUE)) {
                contentValues5 = (ContentValues) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbaf40d6e2d1088d2b4a2a19e02c87fa");
            } else {
                contentValues5 = new ContentValues();
                contentValues5.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues5.put("data1", str);
                contentValues5.put("data2", (Integer) 1);
                contentValues5.put("data4", str2);
            }
            arrayList.add(contentValues5);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.nickName)) {
            String str3 = addPhoneContactParam.nickName;
            Object[] objArr3 = {str3};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "629172271c6a3c3f2d96e6765c4dd38a", RobustBitConfig.DEFAULT_VALUE)) {
                contentValues4 = (ContentValues) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "629172271c6a3c3f2d96e6765c4dd38a");
            } else {
                contentValues4 = new ContentValues();
                contentValues4.put("mimetype", "vnd.android.cursor.item/nickname");
                contentValues4.put("data1", str3);
            }
            arrayList.add(contentValues4);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.addressCountry) || !TextUtils.isEmpty(addPhoneContactParam.addressState) || !TextUtils.isEmpty(addPhoneContactParam.addressCity) || !TextUtils.isEmpty(addPhoneContactParam.addressStreet)) {
            arrayList.add(a(3, addPhoneContactParam.addressCountry, addPhoneContactParam.addressState, addPhoneContactParam.addressCity, addPhoneContactParam.addressStreet, addPhoneContactParam.addressPostalCode));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.homeAddressCountry) || !TextUtils.isEmpty(addPhoneContactParam.homeAddressState) || !TextUtils.isEmpty(addPhoneContactParam.homeAddressCity) || !TextUtils.isEmpty(addPhoneContactParam.homeAddressStreet)) {
            arrayList.add(a(1, addPhoneContactParam.homeAddressCountry, addPhoneContactParam.homeAddressState, addPhoneContactParam.homeAddressCity, addPhoneContactParam.homeAddressStreet, addPhoneContactParam.homeAddressPostalCode));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.workAddressCountry) || !TextUtils.isEmpty(addPhoneContactParam.workAddressState) || !TextUtils.isEmpty(addPhoneContactParam.workAddressState) || !TextUtils.isEmpty(addPhoneContactParam.workAddressStreet)) {
            arrayList.add(a(2, addPhoneContactParam.workAddressCountry, addPhoneContactParam.workAddressState, addPhoneContactParam.workAddressCity, addPhoneContactParam.workAddressStreet, addPhoneContactParam.workAddressPostalCode));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.workPhoneNumber)) {
            arrayList.add(a(3, addPhoneContactParam.workPhoneNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.homePhoneNumber)) {
            arrayList.add(a(1, addPhoneContactParam.homePhoneNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.mobilePhoneNumber)) {
            arrayList.add(a(2, addPhoneContactParam.mobilePhoneNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.hostNumber)) {
            arrayList.add(a(10, addPhoneContactParam.hostNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.remark)) {
            String str4 = addPhoneContactParam.remark;
            Object[] objArr4 = {str4};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8e486598ac332d4924b253758b1affec", RobustBitConfig.DEFAULT_VALUE)) {
                contentValues3 = (ContentValues) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8e486598ac332d4924b253758b1affec");
            } else {
                contentValues3 = new ContentValues();
                contentValues3.put("mimetype", "vnd.android.cursor.item/note");
                contentValues3.put("data1", str4);
            }
            arrayList.add(contentValues3);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.url)) {
            String str5 = addPhoneContactParam.url;
            Object[] objArr5 = {str5};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aeaa56e922a33edafbd9ff10036a274a", RobustBitConfig.DEFAULT_VALUE)) {
                contentValues2 = (ContentValues) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aeaa56e922a33edafbd9ff10036a274a");
            } else {
                contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/website");
                contentValues2.put("data1", str5);
            }
            arrayList.add(contentValues2);
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.workFaxNumber)) {
            arrayList.add(a(4, addPhoneContactParam.workFaxNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.homeFaxNumber)) {
            arrayList.add(a(5, addPhoneContactParam.homeFaxNumber));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.photoFilePath)) {
            arrayList.add(a(addPhoneContactParam.photoFilePath, msiContext));
        }
        if (!TextUtils.isEmpty(addPhoneContactParam.weChatNumber)) {
            String str6 = addPhoneContactParam.weChatNumber;
            Object[] objArr6 = {str6};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6e77aa43d91aef7199755a53fea886e3", RobustBitConfig.DEFAULT_VALUE)) {
                contentValues = (ContentValues) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6e77aa43d91aef7199755a53fea886e3");
            } else {
                contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/im");
                contentValues.put("data1", str6);
                contentValues.put("data5", (Integer) (-1));
                contentValues.put("data6", "WeChat");
            }
            arrayList.add(contentValues);
        }
        intent.putParcelableArrayListExtra("data", arrayList);
    }

    private ContentValues a(int i, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e36287ae73d834d309fb1f67bb0c90", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e36287ae73d834d309fb1f67bb0c90");
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(StringUtil.SPACE);
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(StringUtil.SPACE);
        }
        if (str3 != null) {
            sb.append(str3);
            sb.append(StringUtil.SPACE);
        }
        if (str4 != null) {
            sb.append(str4);
            sb.append(StringUtil.SPACE);
        }
        if (str5 != null) {
            sb.append(str5);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues.put("data1", sb.toString());
        contentValues.put("data2", Integer.valueOf(i));
        return contentValues;
    }

    private ContentValues a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dda46e52f773f64d6789424f363d491", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dda46e52f773f64d6789424f363d491");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("data1", str);
        contentValues.put("data2", Integer.valueOf(i));
        return contentValues;
    }

    private ContentValues a(String str, MsiContext msiContext) {
        InputStream inputStream;
        Bitmap bitmap;
        Throwable th;
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979884b7886918cf07156487b0504c21", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979884b7886918cf07156487b0504c21");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/photo");
        String a2 = msiContext.getFileProvider().a(str);
        a.a("chooseContact localFilePath: " + a2);
        if (a2 != null && b.a(a2, msiContext.getFileProvider().a())) {
            DioFile dioFile = new DioFile(a2);
            if (dioFile.c()) {
                Bitmap bitmap2 = null;
                try {
                    inputStream = dioFile.b();
                } catch (IOException unused) {
                    inputStream = null;
                }
                if (inputStream == null) {
                    return contentValues;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap = com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
                    if (bitmap != null) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                            contentValues.put("data15", byteArrayOutputStream.toByteArray());
                        } catch (OutOfMemoryError unused2) {
                            bitmap2 = bitmap;
                            h.a(inputStream, byteArrayOutputStream);
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            return contentValues;
                        } catch (Throwable th2) {
                            th = th2;
                            h.a(inputStream, byteArrayOutputStream);
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    }
                    h.a(inputStream, byteArrayOutputStream);
                    if (bitmap != 0) {
                        bitmap.recycle();
                    }
                } catch (OutOfMemoryError unused3) {
                } catch (Throwable th3) {
                    bitmap = null;
                    th = th3;
                }
                return contentValues;
            }
            return contentValues;
        }
        return contentValues;
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11b5700bfd34cb67d4f5e2b1f46d481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11b5700bfd34cb67d4f5e2b1f46d481");
        } else if (i == -1) {
            msiContext.onSuccess(null);
        } else {
            msiContext.onError(500, "addPhoneContact fail");
        }
    }
}
