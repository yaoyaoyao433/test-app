package com.sankuai.waimai.platform.widget.filterbar.view.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SliderSelectData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SliderSelectData> CREATOR = new Parcelable.Creator<SliderSelectData>() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SliderSelectData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529cf99480033814e43c4d329559f0d1", RobustBitConfig.DEFAULT_VALUE) ? (SliderSelectData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529cf99480033814e43c4d329559f0d1") : new SliderSelectData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SliderSelectData[] newArray(int i) {
            return new SliderSelectData[i];
        }
    };
    public static ChangeQuickRedirect a;
    @SerializedName("code")
    @Expose
    public String b;
    @SerializedName("slider_select_max")
    @Expose
    public int c;
    @SerializedName("slider_select_min")
    @Expose
    public int d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SliderSelectData() {
    }

    public SliderSelectData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88da67f8dc2572a9894c553194757a00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88da67f8dc2572a9894c553194757a00");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public static ArrayList<SliderSelectData> a(Map<String, g> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2089f79046c72858496439232cec3b29", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2089f79046c72858496439232cec3b29");
        }
        ArrayList<SliderSelectData> arrayList = new ArrayList<>();
        if (map != null) {
            for (Map.Entry<String, g> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    SliderSelectData sliderSelectData = new SliderSelectData();
                    sliderSelectData.b = entry.getKey();
                    sliderSelectData.d = entry.getValue().b;
                    sliderSelectData.c = entry.getValue().c;
                    arrayList.add(sliderSelectData);
                }
            }
        }
        return arrayList;
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c16c4d708f85cbe39b97e11be715b47", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c16c4d708f85cbe39b97e11be715b47");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("code", this.b);
                jSONObject.put("slider_select_max", this.c);
                jSONObject.put("slider_select_min", this.d);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0cf9bbcc04f6a72b51e78fb7dd460ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0cf9bbcc04f6a72b51e78fb7dd460ae");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
