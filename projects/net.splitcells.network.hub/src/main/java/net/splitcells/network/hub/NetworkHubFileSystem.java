package net.splitcells.network.hub;

import net.splitcells.dem.environment.config.framework.OptionI;
import net.splitcells.dem.resource.FileSystemView;

import static net.splitcells.dem.resource.FileSystemViaClassResources.fileSystemViaClassResources;

public class NetworkHubFileSystem extends OptionI<FileSystemView> {
    public NetworkHubFileSystem() {
        super(() -> fileSystemViaClassResources(NetworkHubFileSystem.class, "net.splitcells", "network.hub"));
    }
}
