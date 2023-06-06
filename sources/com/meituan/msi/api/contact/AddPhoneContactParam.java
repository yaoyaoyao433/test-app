package com.meituan.msi.api.contact;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AddPhoneContactParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    public String addressCity;
    public String addressCountry;
    public String addressPostalCode;
    public String addressState;
    public String addressStreet;
    public String email;
    @MsiParamChecker(required = true)
    public String firstName;
    public String homeAddressCity;
    public String homeAddressCountry;
    public String homeAddressPostalCode;
    public String homeAddressState;
    public String homeAddressStreet;
    public String homeFaxNumber;
    public String homePhoneNumber;
    public String hostNumber;
    public String lastName;
    public String middleName;
    public String mobilePhoneNumber;
    public String nickName;
    public String organization;
    public String photoFilePath;
    public String remark;
    public String title;
    public String url;
    public String weChatNumber;
    public String workAddressCity;
    public String workAddressCountry;
    public String workAddressPostalCode;
    public String workAddressState;
    public String workAddressStreet;
    public String workFaxNumber;
    public String workPhoneNumber;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "299fa4196d98a1f0a6cb4e23ac166cac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "299fa4196d98a1f0a6cb4e23ac166cac");
        }
        return "AddPhoneContactParam{firstName='" + this.firstName + "', photoFilePath='" + this.photoFilePath + "', nickName='" + this.nickName + "', lastName='" + this.lastName + "', middleName='" + this.middleName + "', remark='" + this.remark + "', mobilePhoneNumber='" + this.mobilePhoneNumber + "', weChatNumber='" + this.weChatNumber + "', addressCountry='" + this.addressCountry + "', addressState='" + this.addressState + "', addressCity='" + this.addressCity + "', addressStreet='" + this.addressStreet + "', addressPostalCode='" + this.addressPostalCode + "', organization='" + this.organization + "', title='" + this.title + "', workFaxNumber='" + this.workFaxNumber + "', workPhoneNumber='" + this.workPhoneNumber + "', hostNumber='" + this.hostNumber + "', email='" + this.email + "', url='" + this.url + "', workAddressCountry='" + this.workAddressCountry + "', workAddressState='" + this.workAddressState + "', workAddressCity='" + this.workAddressCity + "', workAddressStreet='" + this.workAddressStreet + "', workAddressPostalCode='" + this.workAddressPostalCode + "', homeFaxNumber='" + this.homeFaxNumber + "', homePhoneNumber='" + this.homePhoneNumber + "', homeAddressCountry='" + this.homeAddressCountry + "', homeAddressState='" + this.homeAddressState + "', homeAddressCity='" + this.homeAddressCity + "', homeAddressStreet='" + this.homeAddressStreet + "', homeAddressPostalCode='" + this.homeAddressPostalCode + "', _mt=" + this._mt + '}';
    }
}
