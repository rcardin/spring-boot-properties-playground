package io.rcardin.propertiesplayground;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Objects;

@ConfigurationProperties(prefix = "integrations")
public class IntegrationsConfiguration {
    private List<? extends IntegrationConfiguration<?>> configurations;

    public List<? extends IntegrationConfiguration<?>> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<? extends IntegrationConfiguration<?>> configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationsConfiguration that = (IntegrationsConfiguration) o;
        return Objects.equals(configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        return "IntegrationsConfiguration{" + "configurations=" + configurations + '}';
    }
}
