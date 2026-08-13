CREATE TABLE projects (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    project_type VARCHAR(50),
    created_at TIMESTAMP NOT NULL
);

CREATE TABLE documents (
    id BIGSERIAL PRIMARY KEY,
    project_id BIGINT NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    title VARCHAR(255) NOT NULL,
    doc_type VARCHAR(50),
    status VARCHAR(20) NOT NULL,
    version INT NOT NULL DEFAULT 1,
    file_path VARCHAR(500),
    created_at TIMESTAMP NOT NULL
);