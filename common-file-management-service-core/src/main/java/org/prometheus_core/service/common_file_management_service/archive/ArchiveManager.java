package org.prometheus_core.service.common_file_management_service.archive;

import org.prometheus_core.service.common_file_management_service.model.management.ArchiveRecord;
import org.prometheus_core.service.common_file_management_service.model.result.GenericResult;

import java.util.List;

public class ArchiveManager
    extends AbstractArchiveProvider
implements ArchiveProvider{

    @Override
    public Long createArchiveRecord(ArchiveRecord archiveRecord) {




        return null;
    }

    @Override
    public List<Long> createArchvieRecords(List<ArchiveRecord> archiveRecords) {
        return null;
    }

    @Override
    public List<ArchiveRecord> getAll() {
        return null;
    }

    @Override
    public ArchiveRecord getById() {
        return null;
    }

    @Override
    public GenericResult storeArchiveRecord(ArchiveRecord archiveRecord) {
        return null;
    }

    @Override
    public List<GenericResult> processAll() {
        return null;
    }

    @Override
    public GenericResult processById(long id) {
        return null;
    }

    @Override
    public GenericResult processArchiveRecord(ArchiveRecord archiveRecord) {
        return null;
    }
}