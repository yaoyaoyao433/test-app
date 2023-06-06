package com.meituan.android.common.sniffer.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.meituan.android.common.sniffer.bean.Constants;
import com.meituan.android.common.sniffer.bean.MonitorConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GsonUtil {
    public static Gson getCommandGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MonitorConfig.Command.class, new JsonDeserializer<MonitorConfig.Command>() { // from class: com.meituan.android.common.sniffer.util.GsonUtil.2
            Gson gson;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public final MonitorConfig.Command deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                if (this.gson == null) {
                    this.gson = GsonUtil.getGson();
                }
                return GsonUtil.deserializeCommand(jsonElement, jsonDeserializationContext, this.gson);
            }
        }).registerTypeAdapter(MonitorConfig.Command.class, new JsonSerializer<MonitorConfig.Command>() { // from class: com.meituan.android.common.sniffer.util.GsonUtil.1
            Gson gson;

            @Override // com.google.gson.JsonSerializer
            public final JsonElement serialize(MonitorConfig.Command command, Type type, JsonSerializationContext jsonSerializationContext) {
                if (this.gson == null) {
                    this.gson = GsonUtil.getGson();
                }
                return GsonUtil.serializeCommand(command, jsonSerializationContext, this.gson);
            }
        });
        return gsonBuilder.create();
    }

    public static Gson getGson() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping().enableComplexMapKeySerialization().create();
    }

    public static Gson getPlumpGson() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping().enableComplexMapKeySerialization().serializeNulls().create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MonitorConfig.Command deserializeCommand(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext, Gson gson) {
        try {
            if (jsonElement.isJsonObject() && jsonElement.getAsJsonObject().has("commandId")) {
                String asString = jsonElement.getAsJsonObject().get("commandId").getAsString();
                if (Constants.COMMAND_ID_FORWARD.equals(asString)) {
                    return (MonitorConfig.ForwardCommand) jsonDeserializationContext.deserialize(jsonElement, MonitorConfig.ForwardCommand.class);
                }
                if (Constants.COMMAND_ID_END.equals(asString)) {
                    return (MonitorConfig.EndCommand) jsonDeserializationContext.deserialize(jsonElement, MonitorConfig.EndCommand.class);
                }
                if (Constants.COMMAND_ID_START.equals(asString)) {
                    return (MonitorConfig.StartCommand) jsonDeserializationContext.deserialize(jsonElement, MonitorConfig.StartCommand.class);
                }
                if (Constants.COMMAND_ID_VIEW.equals(asString)) {
                    return (MonitorConfig.ViewCommand) jsonDeserializationContext.deserialize(jsonElement, MonitorConfig.ViewCommand.class);
                }
                if (Constants.COMMAND_ID_HTTP.equals(asString)) {
                    return (MonitorConfig.HttpCommand) jsonDeserializationContext.deserialize(jsonElement, MonitorConfig.HttpCommand.class);
                }
                if (Constants.COMMAND_ID_THROW.equals(asString)) {
                    return (MonitorConfig.Command) gson.fromJson(jsonElement, (Class<Object>) MonitorConfig.Command.class);
                }
                if (Constants.COMMAND_ID_NORMAL.equals(asString)) {
                    return (MonitorConfig.NormalCommand) gson.fromJson(jsonElement, (Class<Object>) MonitorConfig.NormalCommand.class);
                }
                if (Constants.COMMAND_ID_CUSTOM.equals(asString)) {
                    return (MonitorConfig.CustomCommand) gson.fromJson(jsonElement, (Class<Object>) MonitorConfig.CustomCommand.class);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new MonitorConfig.Command();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JsonElement serializeCommand(MonitorConfig.Command command, JsonSerializationContext jsonSerializationContext, Gson gson) {
        Type type;
        if (command instanceof MonitorConfig.ViewCommand) {
            type = MonitorConfig.ViewCommand.class;
        } else if (command instanceof MonitorConfig.StartCommand) {
            type = MonitorConfig.StartCommand.class;
        } else if (command instanceof MonitorConfig.EndCommand) {
            type = MonitorConfig.EndCommand.class;
        } else if (command instanceof MonitorConfig.ForwardCommand) {
            type = MonitorConfig.ForwardCommand.class;
        } else if (command instanceof MonitorConfig.CustomCommand) {
            type = MonitorConfig.CustomCommand.class;
        } else if (command instanceof MonitorConfig.HttpCommand) {
            type = MonitorConfig.HttpCommand.class;
        } else {
            return gson.toJsonTree(command);
        }
        return jsonSerializationContext.serialize(command, type);
    }
}
