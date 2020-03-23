package io.rcardin.propertiesplayground;

import java.util.Objects;

public class IntegrationConfiguration<T> {

    private String type;
    private String legalEntity;
    private T config;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public T getConfig() {
        return config;
    }

    public void setConfig(T config) {
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationConfiguration<?> that = (IntegrationConfiguration<?>) o;
        return Objects.equals(type, that.type)
                && Objects.equals(legalEntity, that.legalEntity)
                && Objects.equals(config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, legalEntity, config);
    }

    @Override
    public String toString() {
        return "IntegrationConfiguration{"
                + "type='"
                + type
                + '\''
                + ", legalEntity='"
                + legalEntity
                + '\''
                + ", config="
                + config
                + '}';
    }
}
