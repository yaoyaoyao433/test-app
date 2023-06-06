package com.sankuai.waimai.platform.domain.core.order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ComboProduct implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("spu_id")
    public long b;
    @SerializedName(alternate = {"id"}, value = "sku_id")
    public long c;
    @SerializedName(alternate = {"groupId"}, value = "group_id")
    public long d;
    @SerializedName(alternate = {"add_price_attrs"}, value = "premium_attrs")
    @JsonAdapter(GoodsAddPriceAttrTypeAdapter.class)
    public List<GoodsAttr> e;
    @SerializedName(alternate = {"attrs", "goods_attr"}, value = "attr_ids")
    @JsonAdapter(GoodsAttrTypeAdapter.class)
    public List<GoodsAttr> f;
    @SerializedName("count")
    public int g;
    @SerializedName("unavailable_count")
    public String h;
    @SerializedName("name")
    public String i;

    public ComboProduct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901831eff6ae57b4864396f24f2bd4bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901831eff6ae57b4864396f24f2bd4bc");
            return;
        }
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    private ComboProduct(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473e1d491a1bb65bbf2adc62e68e061e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473e1d491a1bb65bbf2adc62e68e061e");
            return;
        }
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.b = orderedFood.spu.id;
        this.c = orderedFood.getSkuId();
        this.d = orderedFood.getGroupId();
        GoodsAttr[] attrIds = orderedFood.getAttrIds();
        if (attrIds != null) {
            this.f = new ArrayList();
            for (GoodsAttr goodsAttr : attrIds) {
                if (goodsAttr != null) {
                    if (goodsAttr.mode == 999) {
                        this.e.add(goodsAttr);
                    } else {
                        this.f.add(goodsAttr);
                    }
                }
            }
        }
        this.g = orderedFood.count;
        this.i = orderedFood.getName();
    }

    public static OrderedFood a(ComboProduct comboProduct) {
        Object[] objArr = {comboProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7edf510424fe45b9c5ecd5f71e02c9b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7edf510424fe45b9c5ecd5f71e02c9b5");
        }
        OrderedFood orderedFood = new OrderedFood();
        orderedFood.setSpuId(comboProduct.b);
        orderedFood.setSkuId(comboProduct.c);
        orderedFood.setCount(comboProduct.g);
        orderedFood.setName(comboProduct.i);
        orderedFood.setAttrs(comboProduct.f, comboProduct.e);
        orderedFood.setGroupId(comboProduct.d);
        return orderedFood;
    }

    public static List<ComboProduct> a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "689cee2d6bad1dd313fc580d255107be", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "689cee2d6bad1dd313fc580d255107be");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() == 0) {
            return arrayList;
        }
        for (OrderedFood orderedFood : list) {
            arrayList.add(new ComboProduct(orderedFood));
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GlobalCartInputTypeAdaptor extends TypeAdapter<List<ComboProduct>> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ List<ComboProduct> read(JsonReader jsonReader) throws IOException {
            Object[] objArr = {jsonReader};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af485f76676fc683f99029b7bbcd56b0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af485f76676fc683f99029b7bbcd56b0") : (List) new Gson().fromJson(jsonReader, new TypeToken<List<ComboProduct>>() { // from class: com.sankuai.waimai.platform.domain.core.order.ComboProduct.GlobalCartInputTypeAdaptor.1
            }.getType());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v7 */
        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, List<ComboProduct> list) throws IOException {
            List<ComboProduct> list2 = list;
            int i = 2;
            boolean z = false;
            char c = 1;
            Object[] objArr = {jsonWriter, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90edd4fed86f7e45351f32f77a6058f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90edd4fed86f7e45351f32f77a6058f");
                return;
            }
            jsonWriter.beginArray();
            if (list2 != null && list2.size() > 0) {
                for (ComboProduct comboProduct : list2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[z ? 1 : 0] = jsonWriter;
                    objArr2[c] = comboProduct;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1489007cd3a9ea3417627c7fdfd965b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, z, "1489007cd3a9ea3417627c7fdfd965b0");
                    } else {
                        jsonWriter.beginObject();
                        jsonWriter.name("spu_id").value(comboProduct.b);
                        jsonWriter.name("sku_id").value(comboProduct.c);
                        jsonWriter.name("group_id").value(comboProduct.d);
                        jsonWriter.name("count").value(comboProduct.g);
                        jsonWriter.name("attrs");
                        jsonWriter.beginArray();
                        if (comboProduct.f != null && comboProduct.f.size() > 0) {
                            int i2 = 0;
                            ?? r12 = z;
                            while (i2 < comboProduct.f.size()) {
                                GoodsAttr goodsAttr = comboProduct.f.get(i2);
                                Object[] objArr3 = new Object[i];
                                objArr3[r12] = jsonWriter;
                                objArr3[1] = goodsAttr;
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3de31bfb1d9206f11512e5d6090656a0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3de31bfb1d9206f11512e5d6090656a0");
                                } else {
                                    jsonWriter.beginObject();
                                    jsonWriter.name("id").value(goodsAttr.id);
                                    jsonWriter.endObject();
                                }
                                i2++;
                                i = 2;
                                r12 = 0;
                            }
                        }
                        jsonWriter.endArray();
                        jsonWriter.name("add_price_attrs");
                        jsonWriter.beginArray();
                        if (comboProduct.e != null && comboProduct.e.size() > 0) {
                            for (int i3 = 0; i3 < comboProduct.e.size(); i3++) {
                                GoodsAttr goodsAttr2 = comboProduct.e.get(i3);
                                Object[] objArr4 = {jsonWriter, goodsAttr2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4539a12f1adb46f7825ded71382d0cf6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4539a12f1adb46f7825ded71382d0cf6");
                                } else {
                                    jsonWriter.beginObject();
                                    jsonWriter.name("id").value(goodsAttr2.id);
                                    jsonWriter.name("count").value(goodsAttr2.count);
                                    jsonWriter.name("value").value(goodsAttr2.value);
                                    jsonWriter.name("unit").value(goodsAttr2.unit);
                                    jsonWriter.name("sequence").value(goodsAttr2.sequence);
                                    jsonWriter.name("hidden").value(goodsAttr2.isHidden);
                                    jsonWriter.name("repeatable_choice").value(goodsAttr2.isRepeatableChoice);
                                    jsonWriter.endObject();
                                }
                            }
                        }
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        i = 2;
                        z = false;
                    }
                    c = 1;
                    z = z;
                }
            }
            jsonWriter.endArray();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SubmitNetInputTypeAdaptor extends TypeAdapter<List<ComboProduct>> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ List<ComboProduct> read(JsonReader jsonReader) throws IOException {
            Object[] objArr = {jsonReader};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ce63d22ed2887fdf022c63c498a854", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ce63d22ed2887fdf022c63c498a854") : (List) new Gson().fromJson(jsonReader, new TypeToken<List<ComboProduct>>() { // from class: com.sankuai.waimai.platform.domain.core.order.ComboProduct.SubmitNetInputTypeAdaptor.1
            }.getType());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v7 */
        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, List<ComboProduct> list) throws IOException {
            List<ComboProduct> list2 = list;
            int i = 2;
            boolean z = false;
            char c = 1;
            Object[] objArr = {jsonWriter, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e52bf02615d023bf5071eb9a8d8d37b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e52bf02615d023bf5071eb9a8d8d37b1");
                return;
            }
            jsonWriter.beginArray();
            if (list2 != null && list2.size() > 0) {
                for (ComboProduct comboProduct : list2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[z ? 1 : 0] = jsonWriter;
                    objArr2[c] = comboProduct;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fad48d10832947fe2f0686909f0a4ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, z, "0fad48d10832947fe2f0686909f0a4ee");
                    } else {
                        jsonWriter.beginObject();
                        jsonWriter.name("spu_id").value(comboProduct.b);
                        jsonWriter.name("sku_id").value(comboProduct.c);
                        jsonWriter.name("group_id").value(comboProduct.d);
                        jsonWriter.name("count").value(comboProduct.g);
                        jsonWriter.name("attr_ids");
                        jsonWriter.beginArray();
                        if (comboProduct.f != null && comboProduct.f.size() > 0) {
                            int i2 = 0;
                            ?? r12 = z;
                            while (i2 < comboProduct.f.size()) {
                                GoodsAttr goodsAttr = comboProduct.f.get(i2);
                                Object[] objArr3 = new Object[i];
                                objArr3[r12] = jsonWriter;
                                objArr3[1] = goodsAttr;
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37c2da2af96a039fad46c2ae55fcdbeb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37c2da2af96a039fad46c2ae55fcdbeb");
                                } else {
                                    jsonWriter.value(goodsAttr.id);
                                }
                                i2++;
                                i = 2;
                                r12 = 0;
                            }
                        }
                        jsonWriter.endArray();
                        jsonWriter.name("premium_attrs");
                        jsonWriter.beginArray();
                        if (comboProduct.e != null && comboProduct.e.size() > 0) {
                            for (int i3 = 0; i3 < comboProduct.e.size(); i3++) {
                                GoodsAttr goodsAttr2 = comboProduct.e.get(i3);
                                Object[] objArr4 = {jsonWriter, goodsAttr2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c6230cad16549c8c2001a7b915e05ee", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c6230cad16549c8c2001a7b915e05ee");
                                } else {
                                    jsonWriter.beginObject();
                                    jsonWriter.name("id").value(goodsAttr2.id);
                                    jsonWriter.name("count").value(goodsAttr2.count);
                                    jsonWriter.name("value").value(goodsAttr2.value);
                                    jsonWriter.name("unit").value(goodsAttr2.unit);
                                    jsonWriter.name("sequence").value(goodsAttr2.sequence);
                                    jsonWriter.name("hidden").value(goodsAttr2.isHidden);
                                    jsonWriter.name("repeatable_choice").value(goodsAttr2.isRepeatableChoice);
                                    jsonWriter.endObject();
                                }
                            }
                        }
                        jsonWriter.endArray();
                        jsonWriter.endObject();
                        i = 2;
                        z = false;
                    }
                    c = 1;
                    z = z;
                }
            }
            jsonWriter.endArray();
        }
    }

    public static String b(List<ComboProduct> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9b9fdeddf883d83054b5ca2be1c3528", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9b9fdeddf883d83054b5ca2be1c3528") : new GsonBuilder().registerTypeAdapter(new TypeToken<List<ComboProduct>>() { // from class: com.sankuai.waimai.platform.domain.core.order.ComboProduct.2
        }.getType(), new GlobalCartInputTypeAdaptor()).create().toJson(list, new TypeToken<List<ComboProduct>>() { // from class: com.sankuai.waimai.platform.domain.core.order.ComboProduct.1
        }.getType());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class GoodsAttrTypeAdapter implements JsonDeserializer<List<GoodsAttr>> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ List<GoodsAttr> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a108ad58b13763ca25b6a1f32fda81", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a108ad58b13763ca25b6a1f32fda81");
            }
            if (jsonElement.isJsonArray()) {
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    if (next.isJsonPrimitive()) {
                        GoodsAttr goodsAttr = new GoodsAttr();
                        goodsAttr.id = next.getAsLong();
                        arrayList.add(goodsAttr);
                    } else if (next.isJsonObject()) {
                        arrayList.add(new Gson().fromJson(next, (Class<Object>) GoodsAttr.class));
                    }
                }
                return arrayList;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class GoodsAddPriceAttrTypeAdapter implements JsonDeserializer<List<GoodsAttr>>, JsonSerializer<List<GoodsAttr>> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ List<GoodsAttr> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51428d80e0256dbb77ea98b6cd820675", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51428d80e0256dbb77ea98b6cd820675");
            }
            if (jsonElement.isJsonArray()) {
                ArrayList arrayList = new ArrayList();
                Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    if (next.isJsonObject()) {
                        GoodsAttr goodsAttr = (GoodsAttr) new Gson().fromJson(next, (Class<Object>) GoodsAttr.class);
                        goodsAttr.setMode(999);
                        arrayList.add(goodsAttr);
                    }
                }
                return arrayList;
            }
            return null;
        }

        @Override // com.google.gson.JsonSerializer
        public /* synthetic */ JsonElement serialize(List<GoodsAttr> list, Type type, JsonSerializationContext jsonSerializationContext) {
            List<GoodsAttr> list2 = list;
            Object[] objArr = {list2, type, jsonSerializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a87318d38a6c9b25ba4fd448e16891", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a87318d38a6c9b25ba4fd448e16891") : new Gson().toJsonTree(list2, type);
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1da9f1cab49f297035557f71c14f4252", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1da9f1cab49f297035557f71c14f4252")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComboProduct comboProduct = (ComboProduct) obj;
        return this.b == comboProduct.b && this.c == comboProduct.c && this.d == comboProduct.d && this.g == comboProduct.g && Objects.equals(this.e, comboProduct.e) && Objects.equals(this.f, comboProduct.f) && Objects.equals(this.i, comboProduct.i);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c763487e6de68c0b93e65b95192b1201", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c763487e6de68c0b93e65b95192b1201")).intValue() : Objects.hash(Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), this.e, this.f, Integer.valueOf(this.g), this.i);
    }
}
