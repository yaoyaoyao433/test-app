package com.sankuai.xm.im.vcard.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(name = VCard.TABLE_NAME)
/* loaded from: classes6.dex */
public class VCard {
    public static final String AVATAR_URL = "avatar_url";
    public static final String BIG_AVATAR_URL = "big_avatar_url";
    public static final String DESCRIPTION = "description";
    public static final String EXTENSION = "extension";
    public static final String INFO_ID = "info_id";
    public static final String IN_GROUP = "in_group";
    public static final String NAME = "name";
    public static final String STATUS = "status";
    public static final String TABLE_NAME = "vcard";
    public static final String TYPE = "type";
    public static final String UPDATE_STAMP = "uts";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = AVATAR_URL)
    private String avatarUrl;
    @Property(name = BIG_AVATAR_URL)
    private String bigAvatarUrl;
    @Property(name = "description")
    private String description;
    @Property(name = "extension")
    private String extension;
    @Property(name = IN_GROUP)
    private short inGroup;
    @Id
    @Property(name = INFO_ID)
    private long infoId;
    @Property(name = "name")
    private String name;
    @Property(name = "status")
    private short status;
    @Property(name = "type")
    private int type;
    @Property(name = "uts")
    private long updateStamp;

    public VCard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11143a1c9af13a95fc2529bbfa892788", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11143a1c9af13a95fc2529bbfa892788");
            return;
        }
        this.avatarUrl = null;
        this.bigAvatarUrl = null;
        this.name = null;
        this.infoId = 0L;
        this.type = 0;
        this.inGroup = (short) 1;
        this.status = (short) 1;
    }

    public static VCard obtain(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29049195a9a474cd0e5df358baa000df", 6917529027641081856L)) {
            return (VCard) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29049195a9a474cd0e5df358baa000df");
        }
        VCard vCard = new VCard();
        vCard.setInfoId(j);
        vCard.setType(i);
        return vCard;
    }

    @GetM(property = "avatarUrl")
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    @SetM(property = "avatarUrl")
    public VCard setAvatarUrl(String str) {
        this.avatarUrl = str;
        return this;
    }

    @GetM(property = "bigAvatarUrl")
    public String getBigAvatarUrl() {
        return this.bigAvatarUrl;
    }

    @SetM(property = "bigAvatarUrl")
    public VCard setBigAvatarUrl(String str) {
        this.bigAvatarUrl = str;
        return this;
    }

    @GetM(property = "name")
    public String getName() {
        return this.name;
    }

    @SetM(property = "name")
    public VCard setName(String str) {
        this.name = str;
        return this;
    }

    @GetM(property = "infoId")
    public long getInfoId() {
        return this.infoId;
    }

    @SetM(property = "infoId")
    public VCard setInfoId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f05ea80fd494978e5ab40cbcc3f41a2", 6917529027641081856L)) {
            return (VCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f05ea80fd494978e5ab40cbcc3f41a2");
        }
        this.infoId = j;
        return this;
    }

    @GetM(property = "type")
    public int getType() {
        return this.type;
    }

    @SetM(property = "type")
    public VCard setType(int i) {
        this.type = i;
        return this;
    }

    @GetM(property = "inGroup")
    public short getInGroup() {
        return this.inGroup;
    }

    @SetM(property = "inGroup")
    public VCard setInGroup(short s) {
        this.inGroup = s;
        return this;
    }

    @GetM(property = "status")
    public short getStatus() {
        return this.status;
    }

    @SetM(property = "status")
    public VCard setStatus(short s) {
        this.status = s;
        return this;
    }

    @GetM(property = "extension")
    public String getExtension() {
        return this.extension;
    }

    @SetM(property = "extension")
    public VCard setExtension(String str) {
        this.extension = str;
        return this;
    }

    @GetM(property = "updateStamp")
    public long getUpdateStamp() {
        return this.updateStamp;
    }

    @SetM(property = "updateStamp")
    public VCard setUpdateStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff2c45fd4adc01754c41fce16004cde", 6917529027641081856L)) {
            return (VCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff2c45fd4adc01754c41fce16004cde");
        }
        this.updateStamp = j;
        return this;
    }

    @GetM(property = "description")
    public String getDescription() {
        return this.description;
    }

    @SetM(property = "description")
    public VCard setDescription(String str) {
        this.description = str;
        return this;
    }

    public String getVCardKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d695f12746bce16f5c6717b4e0aeb8fb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d695f12746bce16f5c6717b4e0aeb8fb");
        }
        return this.infoId + CommonConstant.Symbol.UNDERLINE + this.type;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fe29c29dbcd31aad18f4b620108a658", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fe29c29dbcd31aad18f4b620108a658");
        }
        return "VCard{avatarUrl='" + this.avatarUrl + "', name='" + this.name + "', infoId=" + this.infoId + ", inGroup=" + ((int) this.inGroup) + ", description=\"" + this.description + "\"}";
    }
}
